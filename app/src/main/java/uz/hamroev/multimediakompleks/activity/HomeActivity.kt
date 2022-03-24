package uz.hamroev.multimediakompleks.activity

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.Navigation
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.ActivityHomeBinding
import uz.hamroev.multimediakompleks.databinding.DialogLanguageBinding
import java.util.*

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(binding.root)
        supportActionBar?.hide()

        Cache.init(this)

        val navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)

        checkLanguage()

        binding.cardLanguage.setOnClickListener {
            val alertDialog = AlertDialog.Builder(binding.root.context)
            val dialog = alertDialog.create()
            val bindingLanguage =
                DialogLanguageBinding.inflate(LayoutInflater.from(applicationContext))
            dialog.setView(bindingLanguage.root)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setCancelable(true)

            bindingLanguage.textRu.text = resources.getString(R.string.language_rus)
            bindingLanguage.textUk.text = resources.getString(R.string.language_eng)
            bindingLanguage.textUz.text = resources.getString(R.string.language_uzb)

            bindingLanguage.russian.setOnClickListener {
                Cache.language = "ru"
                navController.popBackStack()
                navController.navigate(R.id.homeFragment)
                dialog.dismiss()
            }
            bindingLanguage.uk.setOnClickListener {
                Cache.language = "en"
                navController.popBackStack()
                navController.navigate(R.id.homeFragment)
                dialog.dismiss()
            }
            bindingLanguage.uzb.setOnClickListener {
                Cache.language = "uz"
                navController.popBackStack()
                navController.navigate(R.id.homeFragment)
                dialog.dismiss()
            }

            dialog.show()

        }


    }




    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
    }

    private fun checkLanguage() {
        when (Cache.language) {
            "en" -> {
                setAppLocale(this, "en")
            }
            "ru" -> {
                setAppLocale(this, "ru")
            }
            "uz" -> {
                setAppLocale(this, "uz")
            }
        }
    }
    fun setAppLocale(context: Context, language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = context.resources.configuration
        config.setLocale(locale)
        context.createConfigurationContext(config)
        context.resources.updateConfiguration(
            config,
            context.resources.displayMetrics
        )
    }


}