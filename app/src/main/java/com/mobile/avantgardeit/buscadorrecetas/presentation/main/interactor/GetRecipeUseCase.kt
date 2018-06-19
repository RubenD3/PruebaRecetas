package com.mobile.avantgardeit.buscadorrecetas.presentation.main.interactor

import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import com.mobile.avantgardeit.buscadorrecetas.data.dto.RecipeResponseDto

interface GetRecipeUseCase {

    interface Callback {
        fun onRecipeSuccess(listRecipe: ArrayList<RecipeBo>)

        fun onError()
    }


    fun execute(search : String,callback: Callback)
}