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
import uz.hamroev.multimediakompleks.adapter.DepartmentAdapter
import uz.hamroev.multimediakompleks.adapter.MainAdapter
import uz.hamroev.multimediakompleks.adapter.RoundAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentHomeBinding
import uz.hamroev.multimediakompleks.model.Department
import uz.hamroev.multimediakompleks.model.Main
import uz.hamroev.multimediakompleks.model.Round
import java.util.*
import kotlin.collections.ArrayList


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var listRound: ArrayList<Round>
    lateinit var roundAdapter: RoundAdapter

    lateinit var listDepartment: ArrayList<Department>
    lateinit var departmentAdapter: DepartmentAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        //round data
        loadRoundData()
        val ct = binding.root.context
        roundAdapter = RoundAdapter(ct, listRound, object : RoundAdapter.OnRoundClickListener {
            override fun onCLick(round: Round, position: Int) {
                when (position) {

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
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                        0 -> {}
                    }
                }
            })
        binding.rvDepartment.adapter = departmentAdapter



        return binding.root
    }

    private fun loadDepartmentData() {
        listDepartment = ArrayList()
        listDepartment.add(Department(R.drawable.ic_seminar, "Семинарлар", 45))
        listDepartment.add(Department(R.drawable.ic_subject, "Маъруза", 80))
        listDepartment.add(Department(R.drawable.ic_images, "Фотоҳужжатлар", 10))
        listDepartment.add(Department(R.drawable.ic_documents, "Меъёрий хужжатлар", 35))
        listDepartment.add(Department(R.drawable.ic_electron_library, "Електрон библиография", 100))
        listDepartment.add(
            Department(
                R.drawable.ic_theme_library,
                "Мавзулар бўйича еклекрон кутубхона",
                10
            )
        )
        listDepartment.add(Department(R.drawable.ic_maps, "Ҳариталар", 35))
        listDepartment.add(Department(R.drawable.ic_crossword, "Кроссвордлар", 45))
        listDepartment.add(Department(R.drawable.ic_swot, "Сwот", 45))
        listDepartment.add(Department(R.drawable.ic_tezaurus, "Тезаурус", 45))
        listDepartment.add(Department(R.drawable.ic_test, "Тестлар", 45))
        listDepartment.add(Department(R.drawable.ic_questions, "Назорат саволлари", 45))
        listDepartment.add(Department(R.drawable.ic_users, "Муалиффлар", 45))

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