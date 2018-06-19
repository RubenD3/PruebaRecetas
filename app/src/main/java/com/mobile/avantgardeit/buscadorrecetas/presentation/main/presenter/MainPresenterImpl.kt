package com.mobile.avantgardeit.buscadorrecetas.presentation.main.presenter

import com.mobile.avantgardeit.buscadorrecetas.base.mvp.BasePresenter
import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.interactor.GetRecipeUseCase
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.view.MainView
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(var getRecipeUseCase : GetRecipeUseCase) : BasePresenter<MainView>(),
        MainPresenter, GetRecipeUseCase.Callback {

    override fun viewAttach(baseView: MainView) {
        super.attachView(baseView)
    }

    override fun search(value: String) {

        getRecipeUseCase.execute(value,this)
    }

    override fun onRecipeSuccess(listRecipe: ArrayList<RecipeBo>) {
        view?.showRecipes(listRecipe)
    }

    override fun onError() {
    }

}