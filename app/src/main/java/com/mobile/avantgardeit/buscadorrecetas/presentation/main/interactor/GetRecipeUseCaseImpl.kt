package com.mobile.avantgardeit.buscadorrecetas.presentation.main.interactor

import com.mobile.avantgardeit.buscadorrecetas.base.api.Endpoints
import com.mobile.avantgardeit.buscadorrecetas.data.dto.mapper.RecipeMapper
import com.mobile.avantgardeit.buscadorrecetas.data.unwrapCall
import org.jetbrains.anko.doAsync
import javax.inject.Inject

/**
 * Created by rubendominguez on 18/6/18.
 */
class GetRecipeUseCaseImpl @Inject constructor(var api: Endpoints) : GetRecipeUseCase{


    override fun execute(search: String, callback: GetRecipeUseCase.Callback) {
        doAsync {
            val call = api.getRecipes(search)
            val result = call.execute().body()
            print(result)
            api.getRecipes(search).unwrapCall {
                callback.onRecipeSuccess(RecipeMapper().getRecipeListBo(this))
            }

        }
    }
}