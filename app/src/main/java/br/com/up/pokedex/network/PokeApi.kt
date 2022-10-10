package br.com.up.pokedex.network

import android.util.Log
import br.com.up.pokedex.models.PokeApiResponse
import br.com.up.pokedex.models.Pokemon
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokeApi {

    private var retrofit: Retrofit? = null
    private var apiService: PokeApiService? = null

    init {
        retrofit = Retrofit
            .Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService =
            retrofit?.create(PokeApiService::class.java)
    }

    fun pokemons(listener:(pokemons:List<Pokemon>?) -> Unit){

        apiService?.getPokemons()
            ?.enqueue(object : Callback<PokeApiResponse>{
                override fun onResponse(call: Call<PokeApiResponse>,
                                        response: Response<PokeApiResponse>) {
                    if(response.body() != null){
                        val apiResponse = response.body()
                        listener(apiResponse?.pokemons)
                    }else{
                        listener(null)
                    }
                }

                override fun onFailure(call: Call<PokeApiResponse>,
                                       t: Throwable) {
                    listener(null)
                }
            })

    }






}