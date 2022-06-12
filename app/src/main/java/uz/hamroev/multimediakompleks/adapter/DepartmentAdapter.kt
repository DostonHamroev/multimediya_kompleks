package uz.hamroev.multimediakompleks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.multimediakompleks.databinding.ItemDeparmentBinding
import uz.hamroev.multimediakompleks.model.Department

class DepartmentAdapter(
    var context: Context,
    var list: ArrayList<Department>,
    var onDepartmentCLickListener: OnDepartmentCLickListener
) :
    RecyclerView.Adapter<DepartmentAdapter.VhDepartment>() {

    inner class VhDepartment(var itemDeparmentBinding: ItemDeparmentBinding) :
        RecyclerView.ViewHolder(itemDeparmentBinding.root) {

        fun onBind(department: Department, position: Int) {
            itemDeparmentBinding.title.text = department.title
            itemDeparmentBinding.image.setImageResource(department.image)
            itemDeparmentBinding.progressView.progress = department.progress.toFloat()

            itemDeparmentBinding.progressView.labelText = "${department.title} ${department.progress}%"

            itemDeparmentBinding.main.setOnClickListener {
                onDepartmentCLickListener.onClick(department, position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhDepartment {
        return VhDepartment(
            ItemDeparmentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhDepartment, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size


    interface OnDepartmentCLickListener {
        fun onClick(department: Department, position: Int)
    }
}