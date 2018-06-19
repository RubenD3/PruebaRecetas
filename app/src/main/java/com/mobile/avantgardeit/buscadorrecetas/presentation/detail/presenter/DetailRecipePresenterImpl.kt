package com.mobile.avantgardeit.buscadorrecetas.presentation.detail.presenter

import com.mobile.avantgardeit.buscadorrecetas.base.mvp.BasePresenter
import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.view.DetailRecipeView
import javax.inject.Inject

/**
 * Created by rubendominguez on 19/6/18.
 */
class DetailRecipePresenterImpl : BasePresenter<DetailRecipeView>(),
        DetailRecipePresenter {

    override fun viewAttach(baseView: DetailRecipeView) {
        super.attachView(baseView)
    }

    override fun load(recipe: RecipeBo) {
        with(recipe){
            view?.loadPhoto(thumbnail)
            view?.setTitle(title)
            view?.setIngredients(ingredients)
            view?.setUrl(href)
        }
    }


}