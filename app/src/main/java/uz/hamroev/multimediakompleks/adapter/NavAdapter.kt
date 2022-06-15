package uz.hamroev.multimediakompleks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.multimediakompleks.databinding.ItemNavBinding
import uz.hamroev.multimediakompleks.model.Nav

class NavAdapter(
    var context: Context,
    var list: ArrayList<Nav>,
    var onNavClickListener: OnNavClickListener
) :
    RecyclerView.Adapter<NavAdapter.VhNav>() {

    inner class VhNav(var itemNavBinding: ItemNavBinding) :
        RecyclerView.ViewHolder(itemNavBinding.root) {


        fun onBind(nav: Nav, position: Int) {
            itemNavBinding.navTitle.text = nav.navTitle
            itemNavBinding.icon.setImageResource(nav.icon)
            itemNavBinding.main.setOnClickListener {
                onNavClickListener.onCLick(nav, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhNav {
        return VhNav(ItemNavBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhNav, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size


    interface OnNavClickListener {
        fun onCLick(nav: Nav, position: Int)
    }
}