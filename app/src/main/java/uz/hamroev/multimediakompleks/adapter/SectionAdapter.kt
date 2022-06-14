package uz.hamroev.multimediakompleks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.multimediakompleks.databinding.ItemSectionBinding
import uz.hamroev.multimediakompleks.model.Section

class SectionAdapter(
    var context: Context,
    var list: ArrayList<Section>,
    var onSectionClickLIstener: OnSectionClickLIstener
) :
    RecyclerView.Adapter<SectionAdapter.VhSection>() {

    inner class VhSection(var itemSectionBinding: ItemSectionBinding) :
        RecyclerView.ViewHolder(itemSectionBinding.root) {
        fun onBind(section: Section, position: Int) {
            itemSectionBinding.image.setImageResource(section.image)
            itemSectionBinding.title.text = section.title
            itemSectionBinding.main.setOnClickListener {
                onSectionClickLIstener.onClick(section, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhSection {
        return VhSection(
            ItemSectionBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhSection, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

    interface OnSectionClickLIstener {
        fun onClick(section: Section, position: Int)
    }
}