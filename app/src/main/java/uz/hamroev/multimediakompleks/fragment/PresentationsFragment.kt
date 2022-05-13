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
import uz.hamroev.multimediakompleks.databinding.FragmentPresentationsBinding
import uz.hamroev.multimediakompleks.model.Theme

class PresentationsFragment : Fragment() {


    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter
    lateinit var binding: FragmentPresentationsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPresentationsBinding.inflate(layoutInflater)

        loadPdfs()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation1"
                        }
                        1 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation2"
                        }
                        2 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation3"
                        }
                        3 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation10"
                        }
                        4 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation11"
                        }
                        5 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation12"
                        }
                        6 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation13"
                        }
                        7 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation14"
                        }
                        8 -> {
                            Cache.fragmentName = "presentation"
                            Cache.pdfName = "presentation15"
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
        list.add(Theme("1-mavzu"))
        list.add(Theme("2-mavzu"))
        list.add(Theme("3-mavzu"))
        list.add(Theme("10-mavzu"))
        list.add(Theme("11-mavzu"))
        list.add(Theme("12 mavzu qatag`onlashtirish"))
        list.add(Theme("13-mavzu"))
        list.add(Theme("14-mavzu"))
        list.add(Theme("15-mavzu"))
    }


}