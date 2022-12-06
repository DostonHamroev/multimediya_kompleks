package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.MapAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentXaritaBinding
import uz.hamroev.multimediakompleks.model.Map

class XaritaFragment : Fragment() {


    lateinit var binding: FragmentXaritaBinding
    lateinit var list: ArrayList<Map>
    lateinit var mapAdapter: MapAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentXaritaBinding.inflate(layoutInflater)


        Cache.haritafoiz = 100
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.pdfView.fromAsset("xarita_ru2.pdf").show()

       /* when (Cache.language) {
            "ru" -> {
                binding.second.visibility  = View.GONE
                binding.pdfLinear.visibility  = View.VISIBLE
                binding.pdfView.fromAsset("xarita_ru2.pdf").show()
            }
            "uz" -> {
                binding.second.visibility  = View.VISIBLE
                binding.pdfLinear.visibility  = View.GONE
                loadImage()
                mapAdapter = MapAdapter(binding.root.context, list, object : MapAdapter.OnMapClickListener {
                    override fun onCLick(map: Map, position: Int) {
                        when (position) {
                            0 -> {}
                            1 -> {}
                            2 -> {}
                            3 -> {}
                            4 -> {}
                            5 -> {}
                            6 -> {}
                            7 -> {}
                            8 -> {}
                            9 -> {}
                            10 -> {}
                            11 -> {}
                            12 -> {}
                            13 -> {}
                            14 -> {}
                        }
                    }
                })
                binding.rvMap.adapter = mapAdapter
            }
        }
        */


        return binding.root
    }

    private fun loadImage() {
        list = ArrayList()
        list.add(Map(R.drawable.map1))
        list.add(Map(R.drawable.map2))
        list.add(Map(R.drawable.map3))
        list.add(Map(R.drawable.map4))
        list.add(Map(R.drawable.map5))
        list.add(Map(R.drawable.map6))
        list.add(Map(R.drawable.map15))
        list.add(Map(R.drawable.map7))
        list.add(Map(R.drawable.map8))
        list.add(Map(R.drawable.map9))
        list.add(Map(R.drawable.map10))
        list.add(Map(R.drawable.map11))
        list.add(Map(R.drawable.map12))
        list.add(Map(R.drawable.map13))
        list.add(Map(R.drawable.map14))
    }


}