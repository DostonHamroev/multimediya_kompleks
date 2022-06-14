package uz.hamroev.multimediakompleks.fragment.department.avtorefarat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentAutoReferatPdfBinding

class AutoReferatPdfFragment : Fragment() {

    lateinit var binding: FragmentAutoReferatPdfBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAutoReferatPdfBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        loadPdfs()

        return binding.root
    }

    private fun loadPdfs() {
        when (Cache.autoReferat) {
            "1" -> {
                binding.pdfView.fromAsset("auto1.pdf").show()
            }
            "2" -> {
                binding.pdfView.fromAsset("auto2.pdf").show()
            }
            "3" -> {
                binding.pdfView.fromAsset("auto3.pdf").show()
            }
            "4" -> {
                binding.pdfView.fromAsset("auto4.pdf").show()
            }
            "5" -> {
                binding.pdfView.fromAsset("auto5.pdf").show()
            }
        }
    }


}