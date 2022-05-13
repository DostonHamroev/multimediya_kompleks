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
import uz.hamroev.multimediakompleks.databinding.FragmentPicturesBinding
import uz.hamroev.multimediakompleks.model.Theme

class PicturesFragment : Fragment() {

    lateinit var list: ArrayList<Theme>
    lateinit var themeAdapter: ThemeAdapter
    lateinit var binding: FragmentPicturesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPicturesBinding.inflate(layoutInflater)

        loadPdfs()
        themeAdapter =
            ThemeAdapter(binding.root.context, list, object : ThemeAdapter.OnMainClickListener {
                override fun onClick(theme: Theme, position: Int) {
                    when (position) {
                        0 -> {
                            Cache.fragmentName = "rasm"
                            Cache.pdfName = "rasm"
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
        list.add(Theme("GRANT RASMLAR"))
    }

}