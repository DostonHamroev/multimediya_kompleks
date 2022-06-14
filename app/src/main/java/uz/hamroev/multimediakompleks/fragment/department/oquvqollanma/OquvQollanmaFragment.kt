package uz.hamroev.multimediakompleks.fragment.department.oquvqollanma

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.ThemeAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentOquvQollanmaBinding
import uz.hamroev.multimediakompleks.model.Theme

class OquvQollanmaFragment : Fragment() {


    lateinit var binding: FragmentOquvQollanmaBinding
    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOquvQollanmaBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        loadTheme()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.autoReferatPdfFragment)
                            Cache.autoReferat = "1"
                        }
                        1 -> {
                            findNavController().navigate(R.id.autoReferatPdfFragment)
                            Cache.autoReferat = "2"
                        }
                        2 -> {
                            findNavController().navigate(R.id.autoReferatPdfFragment)
                            Cache.autoReferat = "3"
                        }
                        3 -> {
                            findNavController().navigate(R.id.autoReferatPdfFragment)
                            Cache.autoReferat = "4"
                        }
                        4 -> {
                            findNavController().navigate(R.id.autoReferatPdfFragment)
                            Cache.autoReferat = "5"
                        }
                    }
                }
            })
        binding.rvTheme.adapter = themeAdapter


        return binding.root
    }

    private fun loadTheme() {
        list = ArrayList()
        list.add(Theme("Саидбобоева Г.Н. Туркистон ўлкасини... автореф. 2020"))
        list.add(Theme("Тоғаева А.З. Тошкент-Оренбург темир йўли... автореф. 2010"))
        list.add(Theme("Усаров У.А. Россия империясининг Туркистон ўлкасидаги ер-сув... автореф. 2021"))
        list.add(Theme("Хамраева Т.Р. Создание статистической службы... автореф. 2011"))
        list.add(Theme("Ҳайитов Ж.Ш. Туркистонда янги экин навларининг тарқалиши... автореф. 2020"))

    }


}