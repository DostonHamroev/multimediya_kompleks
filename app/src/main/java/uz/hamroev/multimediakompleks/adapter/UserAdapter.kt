package uz.hamroev.multimediakompleks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.multimediakompleks.databinding.ItemUsersBinding
import uz.hamroev.multimediakompleks.model.MyUser

class UserAdapter(var context: Context, var list: ArrayList<MyUser>) :
    RecyclerView.Adapter<UserAdapter.VhUser>() {


    inner class VhUser(var itemUsersBinding: ItemUsersBinding) :
        RecyclerView.ViewHolder(itemUsersBinding.root) {


        fun onBind(myUser: MyUser, position: Int) {
            itemUsersBinding.name.text = myUser.name
            itemUsersBinding.info.text = myUser.info
            itemUsersBinding.picture.setImageResource(myUser.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhUser {
        return VhUser(ItemUsersBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhUser, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}