package com.mobile.avantgardeit.buscadorrecetas.base.mvp

interface BaseView {
    fun onError()
    fun setPresenter(presenter: BasePresenter<*>)
}