package uz.hamroev.multimediakompleks.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.ActivityPdfShowBinding

class PdfShowActivity : AppCompatActivity() {
    lateinit var binding: ActivityPdfShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Cache.init(this)

        binding.backBtn.setOnClickListener {
            finish()
        }

        loadPdf()


    }

    private fun loadPdf() {
        when (Cache.fragmentName) {
            "swot" -> {
                when (Cache.pdfName) {
                    "swot8" -> {
                        binding.pdfView.fromAsset("swot8.pdf").show()
                    }
                    "swot9" -> {
                        binding.pdfView.fromAsset("swot9.pdf").show()
                    }
                    "swot10" -> {
                        binding.pdfView.fromAsset("swot10.pdf").show()
                    }
                }
            }
            "crossword" -> {
                when (Cache.pdfName) {
                    "crossword8" -> {
                        binding.pdfView.fromAsset("cross8.pdf").show()
                    }
                    "crossword9" -> {
                        binding.pdfView.fromAsset("cross9.pdf").show()
                    }
                    "crossword10" -> {
                        binding.pdfView.fromAsset("cross10.pdf").show()
                    }
                    "crossword11" -> {
                        binding.pdfView.fromAsset("cross11.pdf").show()
                    }
                    "crossword11_2" -> {
                        binding.pdfView.fromAsset("cross11_2.pdf").show()
                    }
                }
            }
            "seminar" -> {
                when (Cache.pdfName) {
                    "seminar1" -> {
                        binding.pdfView.fromAsset("seminar.pdf").show()
                    }
                }
            }
            "subject" -> {
                when (Cache.pdfName) {
                    "subject" -> {
                        binding.pdfView.fromAsset("subject.pdf").show()
                    }
                }
            }
            "rasm" -> {
                when (Cache.pdfName) {
                    "rasm" -> {
                        binding.pdfView.fromAsset("rasm.pdf").show()
                    }
                }
            }
            "presentation" -> {
                when (Cache.pdfName) {
                    "presentation1" -> {
                        binding.pdfView.fromAsset("presentation1.pdf").show()
                    }
                    "presentation2" -> {
                        binding.pdfView.fromAsset("presentation2.pdf").show()
                    }
                    "presentation3" -> {
                        binding.pdfView.fromAsset("presentation3.pdf").show()
                    }
                    "presentation10" -> {
                        binding.pdfView.fromAsset("presentation10.pdf").show()
                    }
                    "presentation11" -> {
                        binding.pdfView.fromAsset("presentation11.pdf").show()
                    }
                    "presentation12" -> {
                        binding.pdfView.fromAsset("presentation12.pdf").show()
                    }
                    "presentation13" -> {
                        binding.pdfView.fromAsset("presentation13.pdf").show()
                    }
                    "presentation14" -> {
                        binding.pdfView.fromAsset("presentation14.pdf").show()
                    }
                    "presentation15" -> {
                        binding.pdfView.fromAsset("presentation15.pdf").show()
                    }
                }
            }
            "map" -> {
                when (Cache.pdfName) {
                    "map9" -> {
                        binding.pdfView.fromAsset("map9.pdf").show()
                    }
                    "map10" -> {
                        binding.pdfView.fromAsset("map10.pdf").show()
                    }
                }
            }
            "doc" -> {
                when (Cache.pdfName) {
                    "doc1" -> {
                        binding.pdfView.fromAsset("doc1.pdf").show()
                    }
                    "doc2" -> {
                        binding.pdfView.fromAsset("doc2.pdf").show()
                    }
                    "doc3" -> {
                        binding.pdfView.fromAsset("doc3.pdf").show()
                    }
                }
            }
        }
    }
}