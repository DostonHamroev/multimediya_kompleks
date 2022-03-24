package uz.hamroev.multimediakompleks.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.MainAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentHomeBinding
import uz.hamroev.multimediakompleks.model.Main
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

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
        list.add(Main(resources.getString(R.string.pictures), R.drawable.ic_images))
        list.add(Main(resources.getString(R.string.questions), R.drawable.ic_questions))
        list.add(Main(resources.getString(R.string.documentation), R.drawable.ic_documents))
        list.add(Main(resources.getString(R.string.authors), R.drawable.ic_authors))

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}