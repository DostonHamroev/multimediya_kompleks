package uz.hamroev.multimediakompleks.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.databinding.FragmentSubjectsBinding


class SubjectsFragment : Fragment() {

    lateinit var binding: FragmentSubjectsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubjectsBinding.inflate(layoutInflater, container, false)

        loadPDF()

        return binding.root
    }

    private fun loadPDF() {

        binding.pdfView.fromAsset("").show()

    }


}