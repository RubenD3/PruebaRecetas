package com.mobile.avantgardeit.buscadorrecetas.presentation.main.di

import com.mobile.avantgardeit.buscadorrecetas.base.di.ActivityScope
import com.mobile.avantgardeit.buscadorrecetas.base.di.component.AppComponent
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.view.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent {
    fun inject(mainActivity: MainActivity)
}