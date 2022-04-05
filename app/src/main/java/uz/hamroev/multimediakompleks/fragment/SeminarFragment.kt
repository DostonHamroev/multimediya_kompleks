package uz.hamroev.multimediakompleks.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.databinding.FragmentSeminarBinding

class SeminarFragment : Fragment() {


    lateinit var binding: FragmentSeminarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeminarBinding.inflate(layoutInflater, container, false)



        return binding.root

    }


}