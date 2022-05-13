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
import uz.hamroev.multimediakompleks.databinding.FragmentDocumentationBinding
import uz.hamroev.multimediakompleks.model.Theme

class DocumentationFragment : Fragment() {


    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter
    lateinit var binding: FragmentDocumentationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDocumentationBinding.inflate(layoutInflater, container, false)

        loadPdfs()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.fragmentName = "doc"
                            Cache.pdfName = "doc1"
                        }
                        1 -> {
                            Cache.fragmentName = "doc"
                            Cache.pdfName = "doc2"
                        }
                        2 -> {
                            Cache.fragmentName = "doc"
                            Cache.pdfName = "doc3"
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
        list.add(Theme("70220301_Tarix_yo'nalishlar_va_faoliyat_turi_bo'yicha"))
        list.add(Theme("ИЎР_маг_5А120302_Тарих_йўналишлар_ва_фаолият_тури_бўйича_1_2_курс"))
        list.add(Theme("Ўзбекистоннинг_XIX_аср_II_ярми_ва_XX_аср_даври_тарихи_З_Ишанходжаева"))
    }


}