package uz.hamroev.multimediakompleks.cache

import android.content.Context
import android.content.SharedPreferences

object Cache {

    private const val NAME = "multimedikoplex"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var language: String?
        get() = sharedPreferences.getString("language", "ru")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("language", value)
            }
        }

    var path: String?
        get() = sharedPreferences.getString("path", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("path", value)
            }
        }

    var regionName: String?
        get() = sharedPreferences.getString("regionname", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("regionname", value)
            }
        }


    var fragmentName: String?
        get() = sharedPreferences.getString("fragmentname", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("fragmentname", value)
            }
        }

    var pdfName: String?
        get() = sharedPreferences.getString("pdfname", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("pdfname", value)
            }
        }

    var fotoHujjat: String?
        get() = sharedPreferences.getString("fotohujjat", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("fotohujjat", value)
            }
        }
    var teza: String?
        get() = sharedPreferences.getString("teza", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("teza", value)
            }
        }


    var doc1: String?
        get() = sharedPreferences.getString("doc1", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("doc1", value)
            }
        }
    var kross: String?
        get() = sharedPreferences.getString("kross", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("kross", value)
            }
        }

    var swot: String?
        get() = sharedPreferences.getString("swot", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("swot", value)
            }
        }

    var autoReferat: String?
        get() = sharedPreferences.getString("autoreferat", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("autoreferat", value)
            }
        }


}
