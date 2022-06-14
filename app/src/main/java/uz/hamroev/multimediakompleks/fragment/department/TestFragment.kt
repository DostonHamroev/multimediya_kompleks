package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentTestBinding

class TestFragment : Fragment() {


    lateinit var binding: FragmentTestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestBinding.inflate(layoutInflater)



        Cache.testfoiz = 100
        loadPdf()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }

    private fun loadPdf() {
        binding.pdfView.fromAsset("test.pdf").show()
    }

}