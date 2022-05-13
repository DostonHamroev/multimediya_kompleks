package uz.hamroev.multimediakompleks.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.activity.PdfShowActivity
import uz.hamroev.multimediakompleks.adapter.ThemeAdapter
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentSwotBinding
import uz.hamroev.multimediakompleks.model.Theme

class SwotFragment : Fragment() {


    lateinit var binding: FragmentSwotBinding
    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSwotBinding.inflate(layoutInflater, container, false)


        loadPdfs()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.fragmentName = "swot"
                            Cache.pdfName = "swot8"
                        }
                        1 -> {
                            Cache.fragmentName = "swot"
                            Cache.pdfName = "swot9"
                        }
                        2 -> {
                            Cache.fragmentName = "swot"
                            Cache.pdfName = "swot10"
                        }
                    }
                    startActivity(Intent(binding.root.context, PdfShowActivity::class.java))
                }

            })
        binding.rv.adapter = themeAdapter


        return binding.root

    }

    private fun loadPdfs() {
        list = ArrayList()
        list.add(Theme("8-mavzu. SWOT va T texnologiyalari"))
        list.add(Theme("9-mavzu. SWOT va T texnologiyalari"))
        list.add(Theme("10-mavzu. SWOT texnologiyasi"))
    }


}