package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.databinding.FragmentNazoratSavollariBinding

class NazoratSavollariFragment : Fragment() {


    lateinit var binding: FragmentNazoratSavollariBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNazoratSavollariBinding.inflate(layoutInflater)


        loadPdf()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }

    private fun loadPdf() {
        binding.pdfView.fromAsset("nazoratsavollari.pdf").show()
    }


}