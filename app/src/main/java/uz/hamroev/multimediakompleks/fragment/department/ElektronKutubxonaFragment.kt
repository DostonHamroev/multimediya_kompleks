package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.SectionAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentElektronKutubxonaBinding
import uz.hamroev.multimediakompleks.model.Section


class ElektronKutubxonaFragment : Fragment() {

    lateinit var binding: FragmentElektronKutubxonaBinding
    lateinit var list: ArrayList<Section>
    lateinit var sectionAdapter: SectionAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentElektronKutubxonaBinding.inflate(layoutInflater)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

        when (Cache.language) {
            "ru" -> {
                binding.second.visibility = View.GONE
                binding.pdfLinear.visibility = View.VISIBLE
                binding.pdfView.fromAsset("elektron_bibliografiya_ru.pdf").show()
            }
            "uz" -> {
                binding.second.visibility = View.VISIBLE
                binding.pdfLinear.visibility = View.GONE
                loadSection()
                sectionAdapter = SectionAdapter(
                    binding.root.context,
                    list,
                    object : SectionAdapter.OnSectionClickLIstener {
                        override fun onClick(section: Section, position: Int) {
                            when (position) {
                                0 -> {
                                    Cache.elektronbibiofoiz = 25
                                    findNavController().navigate(R.id.autoReferatFragment)
                                }
                                1 -> {
                                    Cache.elektronbibiofoiz = 50
                                    findNavController().navigate(R.id.monografiyaFragment)
                                }
                                2 -> {
                                    Cache.elektronbibiofoiz = 75
                                    findNavController().navigate(R.id.oquvQollanmaFragment)
                                }
                                3 -> {
                                    Cache.elektronbibiofoiz = 100
                                    findNavController().navigate(R.id.biblioVaHavolaPdfFragment)
                                }
                            }
                        }
                    })
                binding.rvSection.adapter = sectionAdapter
            }
        }







        return binding.root
    }

    private fun loadSection() {
        list = ArrayList()
        list.add(Section(R.drawable.ic_seminar, "Avtorefetratlar"))
        list.add(Section(R.drawable.ic_seminar, "Monografiyalar"))
        list.add(Section(R.drawable.ic_seminar, "O'quv qo'llanma \nva boshqalar"))
        list.add(Section(R.drawable.ic_seminar, "Bibliografiya \nva havolalar"))
    }


}