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
                    Cache.oquvQollanma = "${position + 1}"
                    findNavController().navigate(R.id.oquvQollanmaPdfFragment)
                }
            })
        binding.rvTheme.adapter = themeAdapter


        return binding.root
    }

    private fun loadTheme() {
        list = ArrayList()
        list.add(Theme("1937-1938-yillardagi katta qirg'in... 2013"))
        list.add(Theme("Абдураҳимова Н.А. Туркистонда чор мустамлака тизими. 2002"))
        list.add(Theme("Алимова Д. ва б. Маҳмудхўжа Беҳбудий... 1999"))
        list.add(Theme("Ирзаев Б. Катта қирғиннинг... 2014"))
        list.add(Theme("Ирзаев Б. Туркистон жадидларининг Кўмак ташкилоти. 2016"))
        list.add(Theme("Исмоил Гаспринский ва Туркистон. 2005"))
        list.add(Theme("Исмоилова Ж.Ҳ. ...Тошкентнинг янги шаҳар қисми тарихи. 2004"))
        list.add(Theme("Исоқов З. Фарғона водийси анъанавий... 2011"))
        list.add(Theme("Каримов Н. 1937-1938 йиллардаги... 2015"))
        list.add(Theme("Мусаев Н. ... Туркистонда саноат ... 2008"))
        list.add(Theme("Мустабид тузумнинг Ўзбекистон миллий бойликларини талаш сиёсат... 2000"))
        list.add(Theme("Положение об управлении Туркестанского края. 1911"))
        list.add(Theme("Ражабов Қ. Файзулла Хўжаев. 2011"))
        list.add(Theme("Рашидов А. Акам ҳақида. 1992"))
        list.add(Theme("Тарихнинг номаълум саҳифалари. 1-китоб. 2009"))
        list.add(Theme("Тарихнинг номаълум саҳифалари. 2-китоб. 2010"))
        list.add(Theme("Тарихнинг номаълум саҳифалари. 3-китоб. 2012"))
        list.add(Theme("Тарихнинг номаълум саҳифалари. 4-китоб. 2013"))
        list.add(Theme("Тарихнинг номаълум саҳифалари. 5-китоб. 2016"))
        list.add(Theme("Тарихнинг номаълум саҳифалари. 6-китоб. 2017"))
        list.add(Theme("Тарихнинг номаълум саҳифалари. 7-китоб. 2018"))
        list.add(Theme("Ҳасанов Б. Катта қирғиннинг... 2014"))

    }


}