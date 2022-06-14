package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.adapter.SectionAdapter
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

        loadSection()
        sectionAdapter = SectionAdapter(
            binding.root.context,
            list,
            object : SectionAdapter.OnSectionClickLIstener {
                override fun onClick(section: Section, position: Int) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.autoReferatFragment)
                        }
                        1 -> {}
                        2 -> {}
                        3 -> {
                            findNavController().navigate(R.id.biblioVaHavolaPdfFragment)
                        }
                    }
                }
            })
        binding.rvSection.adapter = sectionAdapter





        return binding.root
    }

    private fun loadSection() {
        list = ArrayList()
        list.add(Section(R.drawable.ic_seminar, "Автореферат"))
        list.add(Section(R.drawable.ic_seminar, "Монография"))
        list.add(Section(R.drawable.ic_seminar, "Ўқув қулланма ва бошқа"))
        list.add(Section(R.drawable.ic_seminar, "Библиография ва ҳавола"))
    }


}