package uz.hamroev.multimediakompleks.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.activity.TestActivity
import uz.hamroev.multimediakompleks.adapter.MainAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentHomeBinding
import uz.hamroev.multimediakompleks.model.Main
import java.util.*


class HomeFragment : Fragment() {


    lateinit var binding: FragmentHomeBinding
    lateinit var list: ArrayList<Main>
    lateinit var mainAdapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        checkLanguage()
        loadData()
        loadAdapter()

        return binding.root
    }

    private fun loadAdapter() {
        mainAdapter =
            MainAdapter(binding.root.context, list, object : MainAdapter.OnMainClickListener {
                override fun onClick(main: Main, position: Int) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.subjectsFragment)
                        }
                        1 -> {
                            findNavController().navigate(R.id.seminarFragment)
                        }
                        2 -> {
                            findNavController().navigate(R.id.presentationsFragment)
                        }
                        3 -> {
                            findNavController().navigate(R.id.mapsFragment)
                        }
                        4 -> {
                            startActivity(Intent(binding.root.context, TestActivity::class.java))
                        }
                        5 -> {
                            findNavController().navigate(R.id.booksFragment)
                        }
                        6 -> {
                            findNavController().navigate(R.id.crosswordFragment)
                        }
                        7 -> {
                            findNavController().navigate(R.id.swotFragment)
                        }
                        8 -> {
                            findNavController().navigate(R.id.picturesFragment)
                        }
                        9 -> {
                            findNavController().navigate(R.id.questionsFragment)
                        }
                        10 -> {
                            findNavController().navigate(R.id.documentationFragment)
                        }
                        11 -> {
                            findNavController().navigate(R.id.authorsFragment)
                        }
                    }
                }
            })
        binding.rvMain.adapter = mainAdapter
    }


    private fun checkLanguage() {
        when (Cache.language) {
            "en" -> {
                setAppLocale(binding.root.context, "en")
            }
            "ru" -> {
                setAppLocale(binding.root.context, "ru")
            }
            "uz" -> {
                setAppLocale(binding.root.context, "uz")
            }
        }
    }

    fun setAppLocale(context: Context, language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = context.resources.configuration
        config.setLocale(locale)
        context.createConfigurationContext(config)
        context.resources.updateConfiguration(
            config,
            context.resources.displayMetrics
        )
    }


    private fun loadData() {
        list = ArrayList()
        list.add(Main(resources.getString(R.string.subject), R.drawable.ic_subject))
        list.add(Main(resources.getString(R.string.seminar), R.drawable.ic_seminar))
        list.add(Main(resources.getString(R.string.presentation), R.drawable.ic_presentation))
        list.add(Main(resources.getString(R.string.maps), R.drawable.ic_maps))
        list.add(Main(resources.getString(R.string.tests), R.drawable.ic_test))
        list.add(Main(resources.getString(R.string.books), R.drawable.ic_books))
        list.add(Main(resources.getString(R.string.crossword), R.drawable.ic_crossword))
        list.add(Main(resources.getString(R.string.swot), R.drawable.ic_swot))
        list.add(Main(resources.getString(R.string.pictures), R.drawable.ic_images))
        list.add(Main(resources.getString(R.string.questions), R.drawable.ic_questions))
        list.add(Main(resources.getString(R.string.documentation), R.drawable.ic_documents))
        list.add(Main(resources.getString(R.string.authors), R.drawable.ic_authors))

    }


}