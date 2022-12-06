package uz.hamroev.multimediakompleks.fragment

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.hamroev.eclipse.onDataPass.OnDataPass
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.activity.HomeActivity
import uz.hamroev.multimediakompleks.activity.TestActivity
import uz.hamroev.multimediakompleks.adapter.DepartmentAdapter
import uz.hamroev.multimediakompleks.adapter.MainAdapter
import uz.hamroev.multimediakompleks.adapter.NavAdapter
import uz.hamroev.multimediakompleks.adapter.RoundAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.DialogLanguageBinding
import uz.hamroev.multimediakompleks.databinding.FragmentHomeBinding
import uz.hamroev.multimediakompleks.model.Department
import uz.hamroev.multimediakompleks.model.Main
import uz.hamroev.multimediakompleks.model.Nav
import uz.hamroev.multimediakompleks.model.Round
import java.util.*
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    lateinit var listRound: ArrayList<Round>
    lateinit var roundAdapter: RoundAdapter

    lateinit var listDepartment: ArrayList<Department>
    lateinit var departmentAdapter: DepartmentAdapter


    lateinit var dataPasser: OnDataPass


    private lateinit var listNav: ArrayList<Nav>
    private lateinit var navAdapter: NavAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)


        binding.imageMenu.setOnClickListener {
            binding.drawerLayout.open()
        }


        //round data
        loadRoundData()
        val ct = binding.root.context

        roundAdapter = RoundAdapter(ct, listRound, object : RoundAdapter.OnRoundClickListener {
            override fun onCLick(round: Round, position: Int) {
                when (position) {
                    0 -> { /* seminar */
                        findNavController().navigate(R.id.seminarFragment)
                    }
                    1 -> { /* maruza */
                        findNavController().navigate(R.id.maruzaFragment)
                    }
                    2 -> { /* fotohujjat */
                        findNavController().navigate(R.id.fotoHujjatFragment)
                    }
                    3 -> { /* meyoriy hujjat */
                        findNavController().navigate(R.id.meyoriyHujjatFragment)
                    }
                    4 -> { /* elektron biografiya */
                        findNavController().navigate(R.id.elektronKutubxonaFragment)
                    }
                    5 -> { /* mavzu bo'yicha maruza */
                        findNavController().navigate(R.id.mavzularBoyichaFragment)
                    }
                    6 -> { /* xaritalar */
                        findNavController().navigate(R.id.xaritaFragment)
                    }
                    7 -> { /* kroswordlar */
                        findNavController().navigate(R.id.kroswordFragment)
                    }
                    8 -> { /* swot */
                        findNavController().navigate(R.id.swotFragment)
                    }
                    9 -> { /* tezaurus */
                        findNavController().navigate(R.id.tezaurusFragment)
                    }
                    10 -> { /* testlar */
                        findNavController().navigate(R.id.testFragment)
                    }
                    11 -> { /* nazorat savollari */
                        findNavController().navigate(R.id.nazoratSavollariFragment)
                    }
                    12 -> { /* mualliflar */
                        findNavController().navigate(R.id.mualliflarFragment)
                    }

                }
            }
        })
        binding.rvRound.adapter = roundAdapter

        // department data
        loadDepartmentData()
        departmentAdapter = DepartmentAdapter(
            ct,
            listDepartment,
            object : DepartmentAdapter.OnDepartmentCLickListener {
                override fun onClick(department: Department, position: Int) {
                    when (position) {
                        0 -> { /* meyoriy +++++++++++*/
                            findNavController().navigate(R.id.meyoriyHujjatFragment)
                        }
                        1 -> { /* maruza ++++++++++++++++*/
                            findNavController().navigate(R.id.maruzaFragment)
                        }
                        2 -> { /* seminar +++++++++++++++++*/
                            findNavController().navigate(R.id.seminarFragment)
                        }
                        3 -> { /* foto hujjat +++++++*/
                            findNavController().navigate(R.id.fotoHujjatFragment)
                        }
                        4 -> { /* mavzuboyicha biografiya */
                            findNavController().navigate(R.id.mavzularBoyichaFragment)
                        }
                        5 -> { /* elektronbibliografiya+++++++++++*/
                            findNavController().navigate(R.id.elektronKutubxonaFragment)
                        }
                        6 -> { /* xaritalar ++++++++++*/
                            findNavController().navigate(R.id.xaritaFragment)
                        }
                        7 -> { /* kroswordlar ++++++++*/
                            findNavController().navigate(R.id.kroswordFragment)
                        }
//                        8 -> { /* swot ++++++++++*/
//                            findNavController().navigate(R.id.swotFragment)
//                        }
                        8 -> { /* tezaurus ++++++++*/
                            findNavController().navigate(R.id.tezaurusFragment)
                        }
                        9 -> { /* testlar++++++++++++++ */
                            findNavController().navigate(R.id.testFragment)
                        }
                        10 -> { /* nazorat savollari +++++++++++*/
                            findNavController().navigate(R.id.nazoratSavollariFragment)
                        }
                        11 -> { /* mualliflar */
                            findNavController().navigate(R.id.mualliflarFragment)
                        }
                    }
                }
            })
        binding.rvDepartment.adapter = departmentAdapter


        loadNav()
        navAdapter = NavAdapter(ct, listNav, object : NavAdapter.OnNavClickListener {
            override fun onCLick(nav: Nav, position: Int) {
                when (position) {
                    0 -> {
                        findNavController().popBackStack()
                        findNavController().navigate(R.id.homeFragment)
                        binding.drawerLayout.closeDrawers()
                    }
                    1 -> {
                        findNavController().popBackStack()
                        findNavController().navigate(R.id.userFragment)
                        binding.drawerLayout.closeDrawers()
                    }
                    2 -> {
                        binding.drawerLayout.closeDrawers()
                        val alertDialog = android.app.AlertDialog.Builder(binding.root.context)
                        val dialog = alertDialog.create()
                        val bindingLanguage =
                            DialogLanguageBinding.inflate(LayoutInflater.from(requireContext()))
                        dialog.setView(bindingLanguage.root)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        dialog.setCancelable(true)


                        bindingLanguage.russian.setOnClickListener {
                            Cache.language = "ru"
                            setAppLocale(requireContext(), "ru")
                            findNavController().popBackStack()
                            findNavController().navigate(R.id.homeFragment)
                            dialog.dismiss()
                        }
//                        bindingLanguage.uk.setOnClickListener {
//                            Cache.language = "en"
//                            findNavController().popBackStack()
//                            findNavController().navigate(R.id.homeFragment)
//                            dialog.dismiss()
//                        }
                        bindingLanguage.uzb.setOnClickListener {
                            Cache.language = "uz"
                            setAppLocale(requireContext(), "uz")
                            findNavController().popBackStack()
                            findNavController().navigate(R.id.homeFragment)
                            dialog.dismiss()
                        }


                        dialog.show()
                    }
                    3 -> {
                        try {
                            val intent = Intent(Intent.ACTION_SEND)
                            intent.type = "text/plain"
                            intent.putExtra(Intent.EXTRA_SUBJECT, "Мультимедиа комплекс")
                            val shareMessage =
                                "https://play.google.com/store/apps/details?id=${activity!!.packageName}"
                            intent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                            startActivity(Intent.createChooser(intent, "share by Doston"))
                        } catch (e: Exception) {
                        }
                        binding.drawerLayout.closeDrawers()
                    }
                    4 -> {
                        try {
                            val uri: Uri =
                                Uri.parse("market://details?id=${activity!!.packageName}")
                            val intent = Intent(Intent.ACTION_VIEW, uri)
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)
                        } catch (e: ActivityNotFoundException) {
                            val uri: Uri =
                                Uri.parse("http://play.google.com/store/apps/details?id=${activity!!.packageName}")
                            val intent = Intent(Intent.ACTION_VIEW, uri)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                            startActivity(intent)
                        }
                        binding.drawerLayout.closeDrawers()
                    }
                    5 -> {
                        findNavController().popBackStack()
                        activity?.finish()
                    }
                }
            }
        })
        binding.rvNav.adapter = navAdapter


        return binding.root
    }

    private fun loadNav() {
        listNav = ArrayList()
        when (Cache.language) {
            "ru" -> {
                binding.appTitle.text = "Мультимедийный комплекс"
                listNav.add(Nav("Главный", R.drawable.ic_home))
                listNav.add(Nav("Авторы", R.drawable.ic_users_white))
                listNav.add(Nav("Настройки", R.drawable.ic_language))
                listNav.add(Nav("Поделиться", R.drawable.ic_share))
                listNav.add(Nav("Оценка", R.drawable.ic_rate))
                listNav.add(Nav("Выход", R.drawable.ic_exit))
            }
            "uz" -> {
                binding.appTitle.text = "Multimedia\nKompleks"
                listNav.add(Nav("Asosiy", R.drawable.ic_home))
                listNav.add(Nav("Mualliflar", R.drawable.ic_users_white))
                listNav.add(Nav("Sozlash", R.drawable.ic_language))
                listNav.add(Nav("Bo'lishish", R.drawable.ic_share))
                listNav.add(Nav("Baholash", R.drawable.ic_rate))
                listNav.add(Nav("Chiqish", R.drawable.ic_exit))
            }

        }

    }

    fun passData(data: String) {
        dataPasser.onDataPass(data)
    }

    private fun loadDepartmentData() {
        listDepartment = ArrayList()
        listDepartment.add(
            Department(
                R.drawable.ic_documents,
                "${resources.getString(R.string.documentation)}",
                Cache.seminarfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_subject,
                "${resources.getString(R.string.subject)}",
                Cache.maruzafoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_seminar,
                "${resources.getString(R.string.seminar)}",
                Cache.fotohujjatfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_images,
                "${resources.getString(R.string.fotohujjar)}",
                Cache.meyoriyhujjatfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_theme_library,
                "${resources.getString(R.string.mavzu_boyicha)}",
                Cache.elektronbibiofoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_electron_library,
                "${resources.getString(R.string.elektron_bibliografiya)}",
                Cache.maruzalarboyichakutubxonafoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_maps,
                "${resources.getString(R.string.xaritalar)}",
                Cache.haritafoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_crossword,
                "${resources.getString(R.string.krosswordlar)}",
                Cache.krosswordfoiz!!.toShort()
            )
        )
//        listDepartment.add(Department(R.drawable.ic_swot, "Swот", Cache.swotfoiz!!.toShort()))
        listDepartment.add(
            Department(
                R.drawable.ic_tezaurus,
                "${resources.getString(R.string.tezaurus)}",
                Cache.tezarurusfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_test,
                "${resources.getString(R.string.tests)}",
                Cache.testfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_questions,
                "${resources.getString(R.string.nazorat_savollari)}",
                Cache.nazoratsavollarifoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_users,
                "${resources.getString(R.string.authors)}",
                100
            )
        )

    }

    private fun loadRoundData() {
        listRound = ArrayList()
        listRound.add(Round(R.drawable.ic_seminar))
        listRound.add(Round(R.drawable.ic_subject))
        listRound.add(Round(R.drawable.ic_images))
        listRound.add(Round(R.drawable.ic_documents))
        listRound.add(Round(R.drawable.ic_electron_library))
        listRound.add(Round(R.drawable.ic_theme_library))
        listRound.add(Round(R.drawable.ic_maps))
        listRound.add(Round(R.drawable.ic_crossword))
        listRound.add(Round(R.drawable.ic_swot))
        listRound.add(Round(R.drawable.ic_tezaurus))
        listRound.add(Round(R.drawable.ic_test))
        listRound.add(Round(R.drawable.ic_questions))
        listRound.add(Round(R.drawable.ic_users))

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

}