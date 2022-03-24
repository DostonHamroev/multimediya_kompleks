package uz.hamroev.multimediakompleks.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.hamroev.multimediakompleks.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


    }
}