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
import uz.hamroev.multimediakompleks.databinding.FragmentCrosswordBinding
import uz.hamroev.multimediakompleks.model.Theme

class CrosswordFragment : Fragment() {

    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter
    lateinit var binding: FragmentCrosswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCrosswordBinding.inflate(layoutInflater, container, false)

        loadPdfs()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.fragmentName = "crossword"
                            Cache.pdfName = "crossword8"
                        }
                        1 -> {
                            Cache.fragmentName = "crossword"
                            Cache.pdfName = "crossword9"
                        }
                        2 -> {
                            Cache.fragmentName = "crossword"
                            Cache.pdfName = "crossword10"
                        }
                        3 -> {
                            Cache.fragmentName = "crossword"
                            Cache.pdfName = "crossword11"
                        }
                        4 -> {
                            Cache.fragmentName = "crossword"
                            Cache.pdfName = "crossword11_2"
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
        list.add(Theme("8-mavzu. KROSSVORD"))
        list.add(Theme("9-mavzu. KROSSVORD"))
        list.add(Theme("10-mavzu. KROSSVORD"))
        list.add(Theme("11-mavzu. BIRINCHI KROSSVORD"))
        list.add(Theme("11-mavzu. IKKINCHI KROSSVORD"))
    }


}