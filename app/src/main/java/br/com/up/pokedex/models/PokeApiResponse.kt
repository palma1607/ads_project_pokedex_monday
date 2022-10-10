package br.com.up.pokedex.models

import com.google.gson.annotations.SerializedName

data class PokeApiResponse(
    @SerializedName("results")
    var pokemons:List<Pokemon>
)
