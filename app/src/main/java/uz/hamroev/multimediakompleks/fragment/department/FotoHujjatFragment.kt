package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.pdfview.PDFView
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.hamroev.bardambolnew.db.FileDatabase
import uz.hamroev.bardambolnew.db.FileEntity
import uz.hamroev.bardambolnew.pdf.ApiClientPdf
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentFotoHujjatBinding
import uz.hamroev.multimediakompleks.model.PdfDownload
import xyz.teamgravity.checkinternet.CheckInternet
import java.io.*

class FotoHujjatFragment : Fragment() {


    lateinit var binding: FragmentFotoHujjatBinding

    private val TAG = "FotoHujjatFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFotoHujjatBinding.inflate(layoutInflater, container, false)

        checkIsDownload()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


    private fun checkIsDownload() {
        try {
            if (Cache.fotoHujjat == "") {
                Log.d(TAG, "checkIsDownload: FIle not Download")
                pdfDownloadMain()
            } else {
                loadPdfByPath(Cache.fotoHujjat.toString())
                Log.d(TAG, "checkIsDownload: FIle Downloaded")
            }
        } catch (e: Exception) {

        }


    }

    private fun loadPdfByPath(path: String) {
        binding.lottieAnimation.visibility = View.GONE
        binding.pdfView.visibility = View.VISIBLE
        binding.pdfView.fromFile(path).show()
    }

    private fun pdfDownloadMain() {
        binding.lottieAnimation.setOnClickListener {
            binding.lottieAnimation.visibility = View.GONE
            binding.progress.visibility = View.VISIBLE
            val service = ApiClientPdf().service
            service.getPdf("u/0/uc?id=1pWxDalXWs0425XN7FDm19DOWAlVEk9dC&export=download")
                .enqueue(object : Callback<ResponseBody> {

                    val context = binding.root.context
                    val path =
                        "${context.filesDir.absolutePath}/fotohujjatlar.pdf"

                    override fun onResponse(
                        call: Call<ResponseBody>?,
                        response: Response<ResponseBody>?
                    ) {
                        if (response!!.isSuccessful) {
                            Log.d(TAG, "onResponse: Success qaytdi")
                            writeResponseBodyToDisk(response.body(), path)
                            Cache.fotoHujjat = path
                            openPdfWithAdapter(path)
                        }
                    }

                    override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                    }
                })


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

    override fun onResume() {
        super.onResume()
        Cache.fotohujjatfoiz = 100
    }

}