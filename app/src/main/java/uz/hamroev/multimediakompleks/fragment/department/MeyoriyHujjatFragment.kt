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
import uz.hamroev.multimediakompleks.databinding.FragmentMeyoriyHujjatBinding
import uz.hamroev.multimediakompleks.model.Theme

class MeyoriyHujjatFragment : Fragment() {


    lateinit var binding: FragmentMeyoriyHujjatBinding

    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMeyoriyHujjatBinding.inflate(layoutInflater, container, false)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        loadTheme()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.meyoriyhujjatfoiz = 17
                            findNavController().navigate(R.id.meyoriyPdfFragment)
                            Cache.doc1 = "1"
                        }
                        1 -> {
                            Cache.meyoriyhujjatfoiz = 33
                            findNavController().navigate(R.id.meyoriyPdfFragment)
                            Cache.doc1 = "2"
                        }
                        2 -> {
                            Cache.meyoriyhujjatfoiz = 50
                            findNavController().navigate(R.id.meyoriyPdfFragment)
                            Cache.doc1 = "3"
                        }
                        3 -> {
                            Cache.meyoriyhujjatfoiz = 67
                            findNavController().navigate(R.id.meyoriyPdfFragment)
                            Cache.doc1 = "4"
                        }
                        4 -> {
                            Cache.meyoriyhujjatfoiz = 84
                            findNavController().navigate(R.id.meyoriyPdfFragment)
                            Cache.doc1 = "5"
                        }
                        5 -> {
                            Cache.meyoriyhujjatfoiz = 100
                            findNavController().navigate(R.id.meyoriyPdfFragment)
                            Cache.doc1 = "6"
                        }
                    }
                }
            })
        binding.rvTheme.adapter = themeAdapter


        return binding.root
    }

    private fun loadTheme() {
        list = ArrayList()
        list.add(Theme("“Qatag‘on qurbonlarining merosini yanada chuqur o‘rganish va ular xotirasini abadiylashtirishga” doir qo‘shimcha chora-tadbirlar to‘g‘risida"))
        list.add(Theme("“Qatag‘on qurbonlari xotirasi” muzeyi faoliyatini tashkil etish to‘g‘risida"))
        list.add(Theme("Qatag‘on qurbonlari xotirasi» muzeyining faoliyatini yanada takomillashtirish to‘g‘risida "))
        list.add(Theme("“Qatag‘on qurbonlari xotirasi muzeylari hamda «Shahidlar xotirasi» jamoat fondini qo‘llab-quvvatlash” to‘g‘risida "))
        list.add(Theme("Qatag‘on qurbonlari xotirasi muzeylarini tashkil etish chora-tadbirlari to‘g‘risida  "))
        list.add(Theme("Меъёрий хужжатларнинг гиперсылкаси"))
    }


}