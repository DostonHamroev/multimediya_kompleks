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

    var monografiya: String?
        get() = sharedPreferences.getString("monografiya", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("monografiya", value)
            }
        }

    var oquvQollanma: String?
        get() = sharedPreferences.getString("oquvqollanma", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma", value)
            }
        }

    /* Monografoya theme */


    var monografiya1: String?
        get() = sharedPreferences.getString("monografiya1", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("monografiya1", value)
            }
        }
    var monografiya2: String?
        get() = sharedPreferences.getString("monografiya2", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("monografiya2", value)
            }
        }
    var monografiya3: String?
        get() = sharedPreferences.getString("monografiya3", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("monografiya3", value)
            }
        }
    var monografiya4: String?
        get() = sharedPreferences.getString("monografiya4", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("monografiya4", value)
            }
        }

    /* O'quv qo'llanma uchun */

    var oquvqollanma1: String?
        get() = sharedPreferences.getString("oquvqollanma1", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma1", value)
            }
        }

    var oquvqollanma2: String?
        get() = sharedPreferences.getString("oquvqollanma2", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma2", value)
            }
        }

    var oquvqollanma3: String?
        get() = sharedPreferences.getString("oquvqollanma3", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma3", value)
            }
        }

    var oquvqollanma4: String?
        get() = sharedPreferences.getString("oquvqollanma4", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma4", value)
            }
        }

    var oquvqollanma5: String?
        get() = sharedPreferences.getString("oquvqollanma5", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma5", value)
            }
        }

    var oquvqollanma6: String?
        get() = sharedPreferences.getString("oquvqollanma6", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma6", value)
            }
        }

    var oquvqollanma7: String?
        get() = sharedPreferences.getString("oquvqollanma7", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma7", value)
            }
        }

    var oquvqollanma8: String?
        get() = sharedPreferences.getString("oquvqollanma8", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma8", value)
            }
        }

    var oquvqollanma9: String?
        get() = sharedPreferences.getString("oquvqollanma9", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma9", value)
            }
        }

    var oquvqollanma10: String?
        get() = sharedPreferences.getString("oquvqollanma10", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma10", value)
            }
        }

    var oquvqollanma11: String?
        get() = sharedPreferences.getString("oquvqollanma11", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma11", value)
            }
        }

    var oquvqollanma12: String?
        get() = sharedPreferences.getString("oquvqollanma12", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma12", value)
            }
        }

    var oquvqollanma13: String?
        get() = sharedPreferences.getString("oquvqollanma13", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma13", value)
            }
        }

    var oquvqollanma14: String?
        get() = sharedPreferences.getString("oquvqollanma14", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma14", value)
            }
        }

    var oquvqollanma15: String?
        get() = sharedPreferences.getString("oquvqollanma15", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma15", value)
            }
        }

    var oquvqollanma16: String?
        get() = sharedPreferences.getString("oquvqollanma16", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma16", value)
            }
        }

    var oquvqollanma17: String?
        get() = sharedPreferences.getString("oquvqollanma17", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma17", value)
            }
        }

    var oquvqollanma18: String?
        get() = sharedPreferences.getString("oquvqollanma18", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma18", value)
            }
        }

    var oquvqollanma19: String?
        get() = sharedPreferences.getString("oquvqollanma19", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma19", value)
            }
        }

    var oquvqollanma20: String?
        get() = sharedPreferences.getString("oquvqollanma20", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma20", value)
            }
        }

    var oquvqollanma21: String?
        get() = sharedPreferences.getString("oquvqollanma21", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma21", value)
            }
        }

    var oquvqollanma22: String?
        get() = sharedPreferences.getString("oquvqollanma22", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("oquvqollanma22", value)
            }
        }

    /* Present % */

    var seminarfoiz: Int?
        get() = sharedPreferences.getInt("seminarfoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("seminarfoiz", value)
            }
        }

    var maruzafoiz: Int?
        get() = sharedPreferences.getInt("maruzafoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("maruzafoiz", value)
            }
        }
    var fotohujjatfoiz: Int?
        get() = sharedPreferences.getInt("fotohujjatfoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("fotohujjatfoiz", value)
            }
        }
    var meyoriyhujjatfoiz: Int?
        get() = sharedPreferences.getInt("meyoriyhujjatfoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("meyoriyhujjatfoiz", value)
            }
        }
    var elektronbibiofoiz: Int?
        get() = sharedPreferences.getInt("elektronbibiofoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("elektronbibiofoiz", value)
            }
        }
    var maruzalarboyichakutubxonafoiz: Int?
        get() = sharedPreferences.getInt("maruzalarboyichakutubxonafoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("maruzalarboyichakutubxonafoiz", value)
            }
        }
    var haritafoiz: Int?
        get() = sharedPreferences.getInt("haritafoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("haritafoiz", value)
            }
        }
    var krosswordfoiz: Int?
        get() = sharedPreferences.getInt("krosswordfoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("krosswordfoiz", value)
            }
        }
    var swotfoiz: Int?
        get() = sharedPreferences.getInt("swotfoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("swotfoiz", value)
            }
        }
    var tezarurusfoiz: Int?
        get() = sharedPreferences.getInt("tezarurusfoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("tezarurusfoiz", value)
            }
        }
    var testfoiz: Int?
        get() = sharedPreferences.getInt("testfoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("testfoiz", value)
            }
        }
    var nazoratsavollarifoiz: Int?
        get() = sharedPreferences.getInt("nazoratsavollarifoiz", 0)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putInt("nazoratsavollarifoiz", value)
            }
        }


}
