package uz.hamroev.multimediakompleks.fragment.department.monografiya

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.ThemeAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentMonografiyaBinding
import uz.hamroev.multimediakompleks.model.Theme

class MonografiyaFragment : Fragment() {


    lateinit var binding: FragmentMonografiyaBinding
    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMonografiyaBinding.inflate(layoutInflater)
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        loadTheme()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.monografiyaPdfFragment)
                            Cache.monografiya = "1"
                        }
                        1 -> {
                            findNavController().navigate(R.id.monografiyaPdfFragment)
                            Cache.monografiya = "2"
                        }
                        2 -> {
                            findNavController().navigate(R.id.monografiyaPdfFragment)
                            Cache.monografiya = "3"
                        }
                        3 -> {
                            findNavController().navigate(R.id.monografiyaPdfFragment)
                            Cache.monografiya = "4"
                        }
                    }
                }
            })
        binding.rvTheme.adapter = themeAdapter


        return binding.root
    }

    private fun loadTheme() {
        list = ArrayList()
        list.add(Theme("Аъзамхўжаев С. Туркистон Мухторияти. 2000"))
        list.add(Theme("Зиёева Д. Туркистон миллий озодлик ҳаракати. 2000"))
        list.add(Theme("Ирисқулов О.Ж. XIX аср иккинчи ярми – XX аср бошларида... автореф. 2009"))
        list.add(Theme("Савицкая Н. История развития рыночной... 2012"))

    }

}