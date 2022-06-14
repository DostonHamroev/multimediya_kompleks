package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentSeminarBinding


class SeminarFragment : Fragment() {


    lateinit var binding: FragmentSeminarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeminarBinding.inflate(layoutInflater, container, false)

        loadPdf()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }

    private fun loadPdf() {
        binding.pdfView.fromAsset("seminar.pdf").show()
    }

    override fun onResume() {
        super.onResume()
        Cache.seminarfoiz = 100
    }


}