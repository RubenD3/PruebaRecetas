package com.mobile.avantgardeit.buscadorrecetas.presentation.detail.presenter

import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.view.DetailRecipeView

/**
 * Created by rubendominguez on 19/6/18.
 */
interface DetailRecipePresenter {

    fun viewAttach(baseView: DetailRecipeView)

    fun load(recipe : RecipeBo)
}
