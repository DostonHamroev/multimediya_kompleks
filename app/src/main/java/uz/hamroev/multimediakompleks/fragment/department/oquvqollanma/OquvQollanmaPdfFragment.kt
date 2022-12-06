package uz.hamroev.multimediakompleks.fragment.department.oquvqollanma

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
import uz.hamroev.multimediakompleks.databinding.FragmentOquvQollanmaPdfBinding
import java.io.*

class OquvQollanmaPdfFragment : Fragment() {


    lateinit var binding: FragmentOquvQollanmaPdfBinding
    private val TAG = "OquvQollanmaPdfFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOquvQollanmaPdfBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        loadPdfs()

        return binding.root
    }

    private fun loadPdfs() {
        var number: Int = 0
        try {
            number = Cache.oquvQollanma!!.toInt()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        checkIsDownload(number)
    }


    private fun checkIsDownload(number: Int) {
        when (number) {
            1 -> {
                try {
                    if (Cache.oquvqollanma1 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(1)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma1.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            2 -> {
                try {
                    if (Cache.oquvqollanma2 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(2)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma2.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            3 -> {
                try {
                    if (Cache.oquvqollanma3 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(3)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma3.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            4 -> {
                try {
                    if (Cache.oquvqollanma4 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(4)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma4.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            5 -> {
                try {
                    if (Cache.oquvqollanma5 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(5)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma5.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            6 -> {
                try {
                    if (Cache.oquvqollanma6 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(6)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma6.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            7 -> {
                try {
                    if (Cache.oquvqollanma7 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(7)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma7.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            8 -> {
                try {
                    if (Cache.oquvqollanma8 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(8)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma8.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            9 -> {
                try {
                    if (Cache.oquvqollanma9 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(9)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma9.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            10 -> {
                try {
                    if (Cache.oquvqollanma10 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(10)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma10.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            11 -> {
                try {
                    if (Cache.oquvqollanma11 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(11)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma11.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            12 -> {
                try {
                    if (Cache.oquvqollanma12 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(12)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma12.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            13 -> {
                try {
                    if (Cache.oquvqollanma13 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(13)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma13.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            14 -> {
                try {
                    if (Cache.oquvqollanma14 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(14)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma14.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            15 -> {
                try {
                    if (Cache.oquvqollanma15 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(15)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma15.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            16 -> {
                try {
                    if (Cache.oquvqollanma16 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(16)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma16.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            17 -> {
                try {
                    if (Cache.oquvqollanma17 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(17)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma17.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            18 -> {
                try {
                    if (Cache.oquvqollanma18 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(18)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma18.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            19 -> {
                try {
                    if (Cache.oquvqollanma19 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(19)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma19.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            20 -> {
                try {
                    if (Cache.oquvqollanma20 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(20)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma20.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            21 -> {
                try {
                    if (Cache.oquvqollanma21 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(21)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma21.toString())
                        Log.d(TAG, "checkIsDownload: FIle Downloaded")
                    }
                } catch (e: Exception) {

                }

            }
            22 -> {
                try {
                    if (Cache.oquvqollanma22 == "") {
                        Log.d(TAG, "checkIsDownload: FIle not Download")
                        pdfDownloadMain(22)
                    } else {
                        loadPdfByPath(Cache.oquvqollanma22.toString())
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
                    service.getPdf("u/0/uc?id=10vO7GaZXL2qQVyjyq50iwy6uPJ-zqt5A&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma1 = path
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
                    service.getPdf("u/0/uc?id=1NnYd-CnPqBqt6y4fM4QmmzO3YKPIpafX&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma2 = path
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
                    service.getPdf("u/0/uc?id=1Bc5Sr5NGwKuLQLrQzf89YWmlXJlNQHhz&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma3 = path
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
                    service.getPdf("u/0/uc?id=1PGTjEPBjwC4FIcG0SkdXWlB4WsTbT3B1&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma4 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            5 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1L5EEUjxYgnVP_-U6vMwbzV_q78enYYHu&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma5 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            6 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1LscqeF9UoIVLhEcGOTWoFsXczKxJzv6q&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma6 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            7 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1Yg2-j_qUS-P7lwVI_5UX_hds7o7OwS0t&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma7 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            8 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1xH1IZN-3fxkQ2JY6ysOm3bHLfceaBwLe&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma8 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            9 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1b_xkflTNqfFT-l3_ihpR_twBNCOFa8Qz&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma9 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            10 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1JBpLEYnGsN5ImqRXVbMxSwmFSCfUmOtq&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma10 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            11 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1PgFmfV1kUMEDInPwaUiDhDz4MGU5FatD&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma11 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            12 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1DGsuuIfR4PTUPDDj0Ed1BityPBXrso4_&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma12 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            13 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1zCGO_-KBo5YfmwMaFnJPXYwf9kfaK1EB&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma13 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            14 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1SXco9Jjr2wnwBNAHlf9MVIvZ5wBtx_Kl&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma14 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            15 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1clBwgj3vypHv6-rutx6mfRU1oeWo7dF2&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma15 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            16 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=16WkTRjNyaPKJMNkgBmlzRiVKpfQDm8rA&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma16 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            17 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1PG-6YbJHo3aKAtbKrZnlzOFMMAlN1HL5&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma17 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            18 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1UOip_6SUR-f2y4m0-Qj87gkDbXAnexS5&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma18 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            19 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1ZfP3DZe7u3va7tgL4Rh9yN_Z7HenV2BQ&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma19 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            20 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1Xt3eLNEtWM9HgatsoinzFCUA1kHaf5eT&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma20 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            21 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1516znwyienzdYjX2njOr1AQPpPrtM7t-&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma21 = path
                                    openPdfWithAdapter(path)
                                }
                            }

                            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                            }
                        })


                }

            }
            22 -> {
                binding.lottieAnimation.setOnClickListener {
                    binding.lottieAnimation.visibility = View.GONE
                    binding.progress.visibility = View.VISIBLE
                    val service = ApiClientPdf().service
                    service.getPdf("u/0/uc?id=1JHALRlYOszCPQ2cH6K5AUnDBnB5liMMX&export=download")
                        .enqueue(object : Callback<ResponseBody> {

                            val context = binding.root.context
                            val path =
                                "${context.filesDir.absolutePath}/oquvQollanma${number}.pdf"

                            override fun onResponse(
                                call: Call<ResponseBody>?,
                                response: Response<ResponseBody>?
                            ) {
                                if (response!!.isSuccessful) {
                                    Log.d(TAG, "onResponse: Success qaytdi")
                                    writeResponseBodyToDisk(response.body(), path)
                                    Cache.oquvqollanma22 = path
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