package uz.hamroev.multimediakompleks.fragment.department.bibliovahavola

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.databinding.FragmentBiblioVaHavolaPdfBinding

class BiblioVaHavolaPdfFragment : Fragment() {


    lateinit var binding: FragmentBiblioVaHavolaPdfBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBiblioVaHavolaPdfBinding.inflate(layoutInflater)

        loadPdf()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }

    private fun loadPdf() {
        binding.pdfView.fromAsset("bibliovahavola.pdf").show()
    }

}