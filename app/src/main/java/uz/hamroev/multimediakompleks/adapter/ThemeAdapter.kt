package uz.hamroev.multimediakompleks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.multimediakompleks.databinding.ItemMainBinding
import uz.hamroev.multimediakompleks.databinding.ItemThemeBinding
import uz.hamroev.multimediakompleks.model.Main
import uz.hamroev.multimediakompleks.model.Theme

class ThemeAdapter(
    var context: Context,
    var list: ArrayList<Theme>,
    var onMainClickListener: OnMainClickListener
) :
    RecyclerView.Adapter<ThemeAdapter.VhMain>() {

    inner class VhMain(var itemThemeBinding: ItemThemeBinding) :
        RecyclerView.ViewHolder(itemThemeBinding.root) {

        fun onBind(theme: Theme, position: Int) {
            itemThemeBinding.pdfName.text = theme.pdfName

            itemThemeBinding.main.setOnClickListener {
                onMainClickListener.onClick(theme, position)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhMain {
        return VhMain(ItemThemeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhMain, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnMainClickListener {
        fun onClick(theme: Theme, position: Int)
    }
}