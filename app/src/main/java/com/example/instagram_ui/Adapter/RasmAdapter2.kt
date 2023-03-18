package Adapter

import Models.Rasm
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_ui.databinding.ItemRv2Binding
import com.squareup.picasso.Picasso


class RasmAdapter2(val rasmList:List<Rasm>) : RecyclerView.Adapter<RasmAdapter2.Vh>(){

    inner class Vh(var itemRv2Binding: ItemRv2Binding) : RecyclerView.ViewHolder(itemRv2Binding.root) {

        fun onBind(rasm: Rasm, position: Int) {
            Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(itemRv2Binding.imageRv2);
            Picasso.get().load("https://images.pexels.com/photos/36717/amazing-animal-beautiful-beautifull.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500").into(itemRv2Binding.imageRv2);
            Picasso.get().load("https://i0.wp.com/i.redd.it/aujo2c6gtzq61.jpg?resize=1200%2C800&ssl=1").into(itemRv2Binding.imageRv2);
            Picasso.get().load("https://wallpaperaccess.com/full/138728.jpg").into(itemRv2Binding.imageRv2);
            Picasso.get().load("https://e0.pxfuel.com/wallpapers/915/280/desktop-wallpaper-moon-tree-galaxy-nebula-stars-night-digital-art-sci-fi-for-laptop-notebook.jpg").into(itemRv2Binding.imageRv2);

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