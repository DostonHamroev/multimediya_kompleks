package uz.hamroev.multimediakompleks.fragment.department.monografiya

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.hamroev.bardambolnew.pdf.ApiClientPdf
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentMonografiyaPdfBinding
import java.io.*

class MonografiyaPdfFragment : Fragment() {


    lateinit var binding: FragmentMonografiyaPdfBinding
    private val TAG = "MonografiyaPdfFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMonografiyaPdfBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        loadPdfs()



        return binding.root
    }

    private fun loadPdfs() {
        when (Cache.monografiya) {
            "1" -> {
                checkIsDownload(1)
            }
            "2" -> {
                checkIsDownload(2)
            }
            "3" -> {
                checkIsDownload(3)
            }
            "4" -> {
                checkIsDownload(4)
            }
        }
    }

    private fun checkIsDownload(number: Int) {
        when (number) {
            1 -> {
                try {
                    if (Cache.monografiya1 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(1)
                    } else {
                        loadPdfByPath(Cache.monografiya1.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            2 -> {
                try {
                    if (Cache.monografiya2 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(2)
                    } else {
                        loadPdfByPath(Cache.monografiya2.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }
            }
            3 -> {
                try {
                    if (Cache.monografiya3 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(3)
                    } else {
                        loadPdfByPath(Cache.monografiya3.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }
            }
            4 -> {
                try {
                    if (Cache.monografiya4 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(4)
                    } else {
                        loadPdfByPath(Cache.monografiya4.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }
            }
        }
    }


    private fun pdfDownloadMain(number: Int) {
        when (number) {
            1 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1w-QzOrVuZEOrU1Wc9ZhryfqS9CZoiUKY&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/monografiya1.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.monografiya1 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }
            }
            2 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1o3YWh13_ca8eRBRE_GL-TOBzJeWempk9&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/monografiya2.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.monografiya2 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }
            }
            3 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1V2wj1lhBNX4S2-5zedm8sfxibVei_yoF&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/monografiya3.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.monografiya3 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }
            }
            4 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1ywwe3Bbmu1uzdQL4vHwO8Oxv-ddeAqMu&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/monografiya4.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.monografiya4 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }
            }

        }
    }


    private fun openPdfWithAdapter(path: String) {
        binding.lottieAnimation.visibility = View.GONE
        binding.progress.visibility = View.GONE
        binding.pdfView.visibility = View.VISIBLE
        binding.pdfView.fromFile(path).show()
    }

    fun writeResponseBodyToDisk(body: ResponseBody, filePath: String): Boolean {
        try {
            var mediaFile = File(filePath)
            var inputStream: InputStream? = null
            var outputStream: OutputStream? = null
            try {
                val fileReader = ByteArray(4096)
                val fileSize = body.contentLength()
                var fileSizeDownloaded: Long = 0
                inputStream = body.byteStream()
                outputStream = FileOutputStream(mediaFile)
                while (true) {
                    val read = inputStream.read(fileReader)
                    if (read == -1) {
                        break
                    }
                    outputStream.write(fileReader, 0, read)
                    fileSizeDownloaded += read.toLong()
                    Log.d(TAG, "file download: $fileSizeDownloaded of $fileSize")


                }
                outputStream.flush()
                return true
            } catch (e: IOException) {
                return false
            } finally {
                inputStream?.close()
                outputStream?.close()
            }
        } catch (e: IOException) {
            return false
        }
    }


    private fun loadPdfByPath(path: String) {
        binding.lottieAnimation.visibility = View.GONE
        binding.pdfView.visibility = View.VISIBLE
        binding.pdfView.fromFile(path).show()
    }

}