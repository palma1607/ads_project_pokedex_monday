package br.com.up.pokedex.extensions

import br.com.up.pokedex.models.Pokemon

fun Pokemon.id() : String{
   return url.substring(34)
        .replace("/","")
}