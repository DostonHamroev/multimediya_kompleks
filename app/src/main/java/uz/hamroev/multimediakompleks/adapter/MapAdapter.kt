package uz.hamroev.multimediakompleks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.multimediakompleks.databinding.ItemMapBinding
import uz.hamroev.multimediakompleks.model.Map

class MapAdapter(
    context: Context,
    var list: ArrayList<Map>,
    var onMapClickListener: OnMapClickListener
) :
    RecyclerView.Adapter<MapAdapter.VhMap>() {

    inner class VhMap(var itemMapBinding: ItemMapBinding) :
        RecyclerView.ViewHolder(itemMapBinding.root) {

        fun onBind(map: Map, position: Int) {
            itemMapBinding.imageMap.setImageResource(map.imageMap)
            itemMapBinding.imageMap.setOnClickListener {
                onMapClickListener.onCLick(map, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhMap {
        return VhMap(ItemMapBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhMap, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

    interface OnMapClickListener {
        fun onCLick(map: Map, position: Int)
    }

}