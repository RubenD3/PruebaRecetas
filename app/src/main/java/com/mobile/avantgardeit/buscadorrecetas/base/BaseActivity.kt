package com.mobile.avantgardeit.buscadorrecetas.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mobile.avantgardeit.buscadorrecetas.base.di.component.AppComponent
import com.mobile.avantgardeit.buscadorrecetas.base.mvp.BasePresenter
import com.mobile.avantgardeit.buscadorrecetas.base.mvp.BaseView
import org.jetbrains.anko.toast

abstract class BaseActivity: AppCompatActivity(), BaseView {

    private var presenter: BasePresenter<*>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onActivityInject()
    }

    protected abstract fun onActivityInject()

    fun getAppcomponent(): AppComponent = BuscadorRecetasApp.appComponent

    override fun setPresenter(presenter: BasePresenter<*>) {
        this.presenter = presenter
    }

    override fun onError() {
        toast("Something went wrong")
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detachView()
        presenter = null
    }


}