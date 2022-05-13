package uz.hamroev.multimediakompleks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.multimediakompleks.databinding.ItemMainBinding
import uz.hamroev.multimediakompleks.model.Main

class MainAdapter(
    var context: Context,
    var list: ArrayList<Main>,
    var onMainClickListener: OnMainClickListener
) :
    RecyclerView.Adapter<MainAdapter.VhMain>() {

    inner class VhMain(var itemMainBinding: ItemMainBinding) :
        RecyclerView.ViewHolder(itemMainBinding.root) {

        fun onBind(main: Main, position: Int) {
            itemMainBinding.title.text = main.titleMain
            itemMainBinding.img.setImageResource(main.img)

            itemMainBinding.main.setOnClickListener {
                onMainClickListener.onClick(main, position)
            }
            itemMainBinding.title.setOnClickListener {
                onMainClickListener.onClick(main, position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhMain {
        return VhMain(ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhMain, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnMainClickListener {
        fun onClick(main: Main, position: Int)
    }
}