package br.com.up.pokedex.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.up.pokedex.models.Pokemon

class PokeAdapter(val pokeList:List<Pokemon>) : RecyclerView.Adapter<PokeAdapter.PokeViewHolder>() {

    inner class PokeViewHolder(item:View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeViewHolder {

        val inflater = LayoutInflater.from(parent.context)



        return PokeViewHolder()
    }

    override fun onBindViewHolder(holder: PokeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return pokeList.size
    }

}