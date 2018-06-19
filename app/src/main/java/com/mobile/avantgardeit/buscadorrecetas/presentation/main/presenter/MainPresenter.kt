package com.mobile.avantgardeit.buscadorrecetas.presentation.main.presenter

import com.mobile.avantgardeit.buscadorrecetas.presentation.main.view.MainView

interface MainPresenter  {

    fun viewAttach(baseView: MainView)

    fun search(value : String)
}