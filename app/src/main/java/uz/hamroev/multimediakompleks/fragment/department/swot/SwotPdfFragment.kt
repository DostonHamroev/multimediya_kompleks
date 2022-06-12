package uz.hamroev.multimediakompleks.fragment.department.swot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentSwotPdfBinding

class SwotPdfFragment : Fragment() {


    lateinit var binding: FragmentSwotPdfBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSwotPdfBinding.inflate(layoutInflater)


        loadPdfs()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

    private fun loadPdfs() {
        when (Cache.swot) {
            "1" -> {
                binding.pdfView.fromAsset("swot8.pdf").show()
            }
            "2" -> {
                binding.pdfView.fromAsset("swot9.pdf").show()
            }
            "3" -> {
                binding.pdfView.fromAsset("swot10.pdf").show()
            }
        }
    }

}