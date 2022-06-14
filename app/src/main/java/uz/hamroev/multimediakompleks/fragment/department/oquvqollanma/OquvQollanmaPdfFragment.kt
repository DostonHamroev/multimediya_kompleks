package uz.hamroev.multimediakompleks.fragment.department.oquvqollanma

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.databinding.FragmentOquvQollanmaPdfBinding

class OquvQollanmaPdfFragment : Fragment() {


    lateinit var binding: FragmentOquvQollanmaPdfBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOquvQollanmaPdfBinding.inflate(layoutInflater)


        return binding.root
    }


}