package com.mobile.avantgardeit.buscadorrecetas.presentation.detail.di

import com.mobile.avantgardeit.buscadorrecetas.base.di.ActivityScope
import com.mobile.avantgardeit.buscadorrecetas.base.di.component.AppComponent
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.view.DetailRecipeActivity
import dagger.Component

/**
 * Created by rubendominguez on 19/6/18.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(DetailRecipeModule::class))
interface DetailRecipeComponent {
    fun inject(detailRecipeActivity: DetailRecipeActivity)
}