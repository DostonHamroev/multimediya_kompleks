package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.UserAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentMualliflarBinding
import uz.hamroev.multimediakompleks.model.MyUser


class MualliflarFragment : Fragment() {


    lateinit var binding: FragmentMualliflarBinding
    lateinit var list: ArrayList<MyUser>
    lateinit var userAdapter: UserAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMualliflarBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        loadData()
        userAdapter = UserAdapter(binding.root.context, list)
        binding.rvUsers.adapter = userAdapter


        return binding.root
    }

    private fun loadData() {
        list = ArrayList()
        when(Cache.language){
            "ru"->{
                binding.name.text = "Авторы"
                list.add(MyUser("Ишанходжаева\n" +
                        "Замира\n" +
                        "Райимовна","Доктор исторических наук, Профессор кафедры История Узбекистана. Исторический факультет Национального университета Узбекистана имени Мирзо Улугбека.",R.drawable.ic_zamira))
                list.add(MyUser("Бекназарова\n" +
                        "Саида\n" +
                        "Сафибуллаевна","\n" +
                        "Доктор технических наук, Профессор\n" +
                        "Заведующий кафедрой Аудиовизуальных технологий Ташкентского университета информационных технологий имени Мухаммада ал-Хоразмий",R.drawable.ic_saida))
                list.add(MyUser("Шакиров\n" +
                        "Ильяс\n" +
                        "Рахимзянович","PhD, Старший преподаватель кафедры История Узбекистана. Исторический факультет Национального университета Узбекистана имени Мирзо Улугбека. ",R.drawable.ic_ilyos))
                list.add(MyUser("Тогаев\n" +
                        "Жасур\n" +
                        "Эркинович","PhD, Доцент кафедры История Узбекистана. Исторический факультет Национального университета Узбекистана имени Мирзо Улугбека. ",R.drawable.ic_jasur))
                list.add(MyUser("Мухаммадиев\n" +
                        "Рахмон\n" +
                        "Рашидович","PhD,  Доцент кафедры История Узбекистана. Исторический факультет Национального университета Узбекистана имени Мирзо Улугбека. ",R.drawable.ic_rahmon))
                list.add(MyUser("Ирзаев\n" +
                        "Бахром\n" +
                        "Шаймаматович","Phd, Старший научный сотрудник Государственного музея памяти жертв репрессий при КМ РУз.",R.drawable.ic_bahrom))
                list.add(MyUser("Достон\n" +
                        "Хамроев\n" +
                        "Давронович","Android-программист Студент факультета телевизионных технологий Ташкентского университета информационных технологий имени Мухаммада ал-Хоразмий",R.drawable.ic_doston))

            }
            "uz"->{
                binding.name.text = "Mualliflar"
                list.add(MyUser("Ishonxodjayeva\nZamira\nRayimovna\n","Tarix fanlari doktori, professor. Mirzo Ulug'bek nomidagi O'zbekiston Milliy Universiteti, Tarix fakulteti, Oʼzbekiston tarixi kafedrasining professori",R.drawable.ic_zamira))
                list.add(MyUser("Beknazarova\nSaida\nSafibullayevna","Professor\nt.f.d.\nMuhammad al-Xorazmiy nomidagi Toshkent Аxborot texnologiyalari universiteti Аudiovizual texnologiyalar kafedrasi muduri",R.drawable.ic_saida))
                list.add(MyUser("Shakirov\nIlyas\nRaximzyanovich","PhD. Mirzo Ulugʼbek nomidagi Oʼzbekiston Milliy universiteti, Tarix fakulteti, Oʼzbekiston tarixi kafedrasining katta oʼqituvchisi.",R.drawable.ic_ilyos))
                list.add(MyUser("Tog'ayev\nJasur\nErkinovovich","Phd. Mirzo Ulug‘bek nomidagi O‘zbekiston Milliy universiteti\n" + "Tarix fakulteti, O‘zbekiston tarixi kafedrasi dotsenti",R.drawable.ic_jasur))
                list.add(MyUser("Muhammadiyev\nRaxmon\nRashidovich","Phd. Mirzo Ulug‘bek nomidagi O‘zbekiston Milliy universiteti Tarix fakulteti, O‘zbekiston tarixi kafedrasi dotsenti",R.drawable.ic_rahmon))
                list.add(MyUser("Irzayev\nBahrom\nShaymamatovich","O‘zR VM huzuridagi Qatag‘on qurbonlari xotirasi davlat muzeyi katta ilmiy xodimi, tarix fanlari bo‘yicha falsafa doktori (PhD)",R.drawable.ic_bahrom))
                list.add(MyUser("Hamroyev\nDoston\nDavron o'g'li","Android Dasturchi\n" + "\n" + "Muhammad al-Xorazmiy nomidagi Toshkent Аxborot texnologiyalari universiteti Televizion Texnologiyalari fakulteti talabasi",R.drawable.ic_doston))


            }
        }

    }


}