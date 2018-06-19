package com.mobile.avantgardeit.buscadorrecetas.presentation.main.view

import com.mobile.avantgardeit.buscadorrecetas.base.mvp.BaseView
import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo

interface MainView : BaseView {


    fun showRecipes(list : ArrayList<RecipeBo>)
}