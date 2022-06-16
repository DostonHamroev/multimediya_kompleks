package uz.hamroev.multimediakompleks.fragment.department.users

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.UserAdapter
import uz.hamroev.multimediakompleks.databinding.FragmentMualliflarBinding
import uz.hamroev.multimediakompleks.databinding.FragmentUserBinding
import uz.hamroev.multimediakompleks.model.MyUser

class UserFragment : Fragment() {


    lateinit var binding: FragmentUserBinding
    lateinit var list: ArrayList<MyUser>
    lateinit var userAdapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
            findNavController().navigate(R.id.homeFragment)
        }

        loadData()
        userAdapter = UserAdapter(binding.root.context, list)
        binding.rvUsers.adapter = userAdapter


        return binding.root
    }

    private fun loadData() {
        list = ArrayList()
        list.add(
            MyUser(
                "Zamira\nRaimovna\nIshonxodjayeva",
                "Professor O'zMU",
                R.drawable.ic_zamira
            )
        )
        list.add(
            MyUser(
                "Irzayev\nBahrom\nShaymamatovich",
                "O‘zR VM huzuridagi Qatag‘on qurbonlari xotirasi davlat muzeyi katta ilmiy xodimi, tarix fanlari bo‘yicha falsafa doktori (PhD)",
                R.drawable.ic_bahrom
            )
        )
        list.add(
            MyUser(
                "Saida\nBeknazarova\nSafibullayevna",
                "Professor\nt.f.d.\nMuhammad al-Xorazmiy nomidagi Toshkent Аxborot texnologiyalari universiteti Аudiovizual texnologiyalar kafedrasi professori",
                R.drawable.ic_saida
            )
        )
        list.add(
            MyUser(
                "Tog'ayev\nJasur\nErkinov",
                "Mirzo Ulug‘bek nomidagi O‘zbekiston Milliy universiteti\n" + "Tarix fakul'teti O‘zbekiston tarixi kafedrasi katta o‘qituvchisi,  tarix fanlari bo‘yicha falsafa doktori (PhD)",
                R.drawable.ic_jasur
            )
        )
        list.add(
            MyUser(
                "Muhammadiyev\nRaxmon\nRashidovich",
                "Mirzo Ulug‘bek nomidagi O‘zbekiston Milliy universiteti Tarix fakul'teti “O‘zbekiston tarixi” kafedrasi o‘qituvchisi",
                R.drawable.ic_rahmon
            )
        )
        list.add(
            MyUser(
                "Doston\nHamroyev\nDavron o'g'li",
                "Android Dasturchi\n" + "\n" + "Muhammad al-Xorazmiy nomidagi Toshkent Аxborot texnologiyalari universiteti Televizion Texnologiyalari fakulteti talabasi",
                R.drawable.ic_doston
            )
        )
    }


}