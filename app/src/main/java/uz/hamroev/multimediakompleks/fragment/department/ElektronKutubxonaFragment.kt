package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.databinding.FragmentElektronKutubxonaBinding


class ElektronKutubxonaFragment : Fragment() {

    lateinit var binding: FragmentElektronKutubxonaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentElektronKutubxonaBinding.inflate(layoutInflater)



        return binding.root
    }


}