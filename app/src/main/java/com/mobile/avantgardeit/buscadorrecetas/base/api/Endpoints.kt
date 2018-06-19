package com.mobile.avantgardeit.buscadorrecetas.base.api

import com.mobile.avantgardeit.buscadorrecetas.data.dto.RecipeResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Endpoints {
    @GET("/api/?")
    fun getRecipes(@Query("q") value : String): Call<RecipeResponseDto>
}