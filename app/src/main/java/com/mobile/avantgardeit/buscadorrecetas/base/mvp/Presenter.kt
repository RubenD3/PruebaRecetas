package com.mobile.avantgardeit.buscadorrecetas.base.mvp

interface Presenter<V : BaseView> {

    fun attachView(view: V)

    fun detachView()
}