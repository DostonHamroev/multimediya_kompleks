package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.ThemeAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentSwotBinding
import uz.hamroev.multimediakompleks.model.Theme

class SwotFragment : Fragment() {


    lateinit var binding: FragmentSwotBinding
    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSwotBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        loadTheme()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.swotfoiz = 20
                            findNavController().navigate(R.id.krosswordPdfFragment)
                            Cache.kross = "1"
                        }
                        1 -> {
                            Cache.swotfoiz = 40
                            findNavController().navigate(R.id.krosswordPdfFragment)
                            Cache.kross = "2"
                        }
                        2 -> {
                            Cache.swotfoiz = 60
                            findNavController().navigate(R.id.krosswordPdfFragment)
                            Cache.kross = "3"
                        }
                        3 -> {
                            Cache.swotfoiz = 80
                            findNavController().navigate(R.id.krosswordPdfFragment)
                            Cache.kross = "4"
                        }
                        4 -> {
                            Cache.swotfoiz = 100
                            findNavController().navigate(R.id.krosswordPdfFragment)
                            Cache.kross = "5"
                        }

                    }
                }
            })
        binding.rvTheme.adapter = themeAdapter


        return binding.root
    }

    private fun loadTheme() {
        list = ArrayList()
        list.add(Theme("8-mavzu. SWOT va T texnologiyalari"))
        list.add(Theme("9-mavzu. SWOT va T texnologiyalari."))
        list.add(Theme("10-mavzu. SWOT texnologiyasi"))
    }


}