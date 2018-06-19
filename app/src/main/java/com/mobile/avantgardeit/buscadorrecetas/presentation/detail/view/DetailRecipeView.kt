package com.mobile.avantgardeit.buscadorrecetas.presentation.detail.view

import com.mobile.avantgardeit.buscadorrecetas.base.mvp.BaseView

/**
 * Created by rubendominguez on 19/6/18.
 */
interface DetailRecipeView : BaseView {

    fun setTitle(title : String)
    fun setIngredients(ingredients : String)
    fun setUrl(url : String)
    fun loadPhoto(urlPhoto : String)
}