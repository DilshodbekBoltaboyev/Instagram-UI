package Adapter

import Models.Rasm
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_ui.Models.Rasm_2
import com.example.instagram_ui.databinding.ItemRv2Binding
import com.squareup.picasso.Picasso


class RasmAdapter2(val rasmList:List<Rasm_2>) : RecyclerView.Adapter<RasmAdapter2.Vh>(){

    inner class Vh(var itemRv2Binding: ItemRv2Binding) : RecyclerView.ViewHolder(itemRv2Binding.root) {

        fun onBind(rasm: Rasm_2, position: Int) {
            itemRv2Binding.imageRv2.setImageResource(rasm.rasm)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRv2Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(rasmList[position], position)
    }

    override fun getItemCount(): Int = rasmList.size
}