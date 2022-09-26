package br.com.up.pokedex.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import br.com.up.pokedex.R
import br.com.up.pokedex.models.Pokemon
import com.squareup.picasso.Picasso

class PokeAdapter(val pokeList:List<Pokemon>) :
    RecyclerView.Adapter<PokeAdapter.PokeViewHolder>() {

    inner class PokeViewHolder(item:View) :
        RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        val layout = inflater
            .inflate(
                R.layout.view_item_pokemon,
                parent,
                false
            )

        return PokeViewHolder(layout)
    }

    override fun onBindViewHolder(holder: PokeViewHolder, position: Int) {

        val url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/59.png"

        val imageView : ImageView =
            holder.itemView.findViewById(R.id.image_pokemon)

        Picasso.get().load(url).into(imageView)

    }

    override fun getItemCount(): Int {
        return 10 //pokeList.size
    }

}