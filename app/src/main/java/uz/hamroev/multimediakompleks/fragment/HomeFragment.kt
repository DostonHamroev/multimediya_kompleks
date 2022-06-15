package uz.hamroev.multimediakompleks.fragment

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.hamroev.eclipse.onDataPass.OnDataPass
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.activity.TestActivity
import uz.hamroev.multimediakompleks.adapter.DepartmentAdapter
import uz.hamroev.multimediakompleks.adapter.MainAdapter
import uz.hamroev.multimediakompleks.adapter.NavAdapter
import uz.hamroev.multimediakompleks.adapter.RoundAdapter
import uz.hamroev.multimediakompleks.cache.Cache
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
                        0 -> { /* seminar +++++++++++*/
                            findNavController().navigate(R.id.seminarFragment)
                        }
                        1 -> { /* maruza ++++++++++++++++*/
                            findNavController().navigate(R.id.maruzaFragment)
                        }
                        2 -> { /* fotohujjat +++++++++++++++++*/
                            findNavController().navigate(R.id.fotoHujjatFragment)
                        }
                        3 -> { /* meyoriy hujjat +++++++*/
                            findNavController().navigate(R.id.meyoriyHujjatFragment)
                        }
                        4 -> { /* elektron biografiya */
                            findNavController().navigate(R.id.elektronKutubxonaFragment)
                        }
                        5 -> { /* mavzu bo'yicha maruza +++++++++++*/
                            findNavController().navigate(R.id.mavzularBoyichaFragment)
                        }
                        6 -> { /* xaritalar ++++++++++*/
                            findNavController().navigate(R.id.xaritaFragment)
                        }
                        7 -> { /* kroswordlar ++++++++*/
                            findNavController().navigate(R.id.kroswordFragment)
                        }
                        8 -> { /* swot ++++++++++*/
                            findNavController().navigate(R.id.swotFragment)
                        }
                        9 -> { /* tezaurus ++++++++*/
                            findNavController().navigate(R.id.tezaurusFragment)
                        }
                        10 -> { /* testlar++++++++++++++ */
                            findNavController().navigate(R.id.testFragment)
                        }
                        11 -> { /* nazorat savollari +++++++++++*/
                            findNavController().navigate(R.id.nazoratSavollariFragment)
                        }
                        12 -> { /* mualliflar */
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
                        findNavController().navigate(R.id.mualliflarFragment)
                        binding.drawerLayout.closeDrawers()
                    }
                    2 -> {
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
                    3 -> {
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
                    4 -> {
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
        listNav.add(Nav("Главный", R.drawable.ic_home))
        listNav.add(Nav("Авторы", R.drawable.ic_users_white))
        listNav.add(Nav("Поделиться", R.drawable.ic_share))
        listNav.add(Nav("Оценивать", R.drawable.ic_rate))
        listNav.add(Nav("Выход", R.drawable.ic_exit))
    }

    fun passData(data: String) {
        dataPasser.onDataPass(data)
    }

    private fun loadDepartmentData() {
        listDepartment = ArrayList()
        listDepartment.add(
            Department(
                R.drawable.ic_seminar,
                "Семинарлар",
                Cache.seminarfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_subject,
                "Маъруза",
                Cache.maruzafoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_images,
                "Фотоҳужжатлар",
                Cache.fotohujjatfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_documents,
                "Меъёрий хужжатлар",
                Cache.meyoriyhujjatfoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_electron_library,
                "Электрон библиография",
                Cache.elektronbibiofoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_theme_library,
                "Мавзулар бўйича еклекрон кутубхона",
                Cache.maruzalarboyichakutubxonafoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_maps,
                "Ҳариталар",
                Cache.haritafoiz!!.toShort()
            )
        )
        listDepartment.add(
            Department(
                R.drawable.ic_crossword,
                "Кроссвордлар",
                Cache.krosswordfoiz!!.toShort()
            )
        )
        listDepartment.add(Department(R.drawable.ic_swot, "Swот", Cache.swotfoiz!!.toShort()))
        listDepartment.add(
            Department(
                R.drawable.ic_tezaurus,
                "Тезаурус",
                Cache.tezarurusfoiz!!.toShort()
            )
        )
        listDepartment.add(Department(R.drawable.ic_test, "Тестлар", Cache.testfoiz!!.toShort()))
        listDepartment.add(
            Department(
                R.drawable.ic_questions,
                "Назорат саволлари",
                Cache.nazoratsavollarifoiz!!.toShort()
            )
        )
        listDepartment.add(Department(R.drawable.ic_users, "Муалиффлар", 100))

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


}