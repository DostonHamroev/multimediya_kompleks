package uz.hamroev.multimediakompleks.app

import android.app.Application
import uz.hamroev.multimediakompleks.cache.Cache

class App : Application() {

    override fun onCreate() {
        Cache.init(this)
        super.onCreate()
    }
}