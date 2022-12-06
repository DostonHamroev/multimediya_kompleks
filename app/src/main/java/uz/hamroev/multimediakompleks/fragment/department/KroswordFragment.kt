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
import uz.hamroev.multimediakompleks.databinding.FragmentKroswordBinding
import uz.hamroev.multimediakompleks.model.Theme

class KroswordFragment : Fragment() {


    lateinit var binding: FragmentKroswordBinding

    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKroswordBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        when (Cache.language) {
            "ru" -> {
                binding.second.visibility  = View.GONE
                binding.pdfLinear.visibility  = View.VISIBLE
                binding.pdfView.fromAsset("krossword_ru.pdf").show()
            }
            "uz" -> {
                binding.second.visibility  = View.VISIBLE
                binding.pdfLinear.visibility  = View.GONE
                loadTheme()
                themeAdapter =
                    ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                        override fun onClick(theme: Theme, position: Int) {
                            when (position) {
                                0 -> {
                                    findNavController().navigate(R.id.krosswordPdfFragment)
                                    Cache.kross = "1"
                                }
                                1 -> {
                                    findNavController().navigate(R.id.krosswordPdfFragment)
                                    Cache.kross = "2"
                                }
                                2 -> {
                                    findNavController().navigate(R.id.krosswordPdfFragment)
                                    Cache.kross = "3"
                                }
                                3 -> {
                                    findNavController().navigate(R.id.krosswordPdfFragment)
                                    Cache.kross = "4"
                                }
                                4 -> {
                                    findNavController().navigate(R.id.krosswordPdfFragment)
                                    Cache.kross = "5"
                                }

                            }
                        }
                    })
                binding.rvTheme.adapter = themeAdapter
            }
        }





        return binding.root
    }

    private fun loadTheme() {
        list = ArrayList()
        list.add(Theme("8-mavzu. KROSSVORD"))
        list.add(Theme("9-mavzu. KROSSVORD"))
        list.add(Theme("10-mavzu. KROSSVORD"))
        list.add(Theme("11-mavzu. BIRINCHI KROSSVORD"))
        list.add(Theme("11-mavzu. IKKINCHI KROSSVORD"))
    }


}