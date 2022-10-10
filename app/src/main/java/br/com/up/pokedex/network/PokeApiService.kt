package br.com.up.pokedex.network

import br.com.up.pokedex.models.PokeApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface PokeApiService {

    @GET("pokemon")
    fun getPokemons(): Call<PokeApiResponse>

    @GET("pokemon/1")
    fun getPokemonById(): Call<String>

    @GET("pokemon/ditto")
    fun getPokemonByName(): Call<String>
}