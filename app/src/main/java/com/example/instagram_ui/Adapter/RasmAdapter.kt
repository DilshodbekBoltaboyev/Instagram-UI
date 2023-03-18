package Adapter

import Models.Rasm
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_ui.R
import com.example.instagram_ui.databinding.RvItemImageBinding
import com.squareup.picasso.Picasso


class RasmAdapter(val rasmList:List<Rasm>) : RecyclerView.Adapter<RasmAdapter.Vh>(){

    inner class Vh(var rvItemImageBinding: RvItemImageBinding) : RecyclerView.ViewHolder(rvItemImageBinding.root) {

        fun onBind(rasm: Rasm, position: Int) {
            rvItemImageBinding.txtRvItem.text = rasm.name
            Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(rvItemImageBinding.imageRvItem);


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(rasmList[position], position)
    }

    override fun getItemCount(): Int = rasmList.size
}