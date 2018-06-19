package com.mobile.avantgardeit.buscadorrecetas.presentation.detail.di

import com.mobile.avantgardeit.buscadorrecetas.base.di.ActivityScope
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.presenter.DetailRecipePresenter
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.presenter.DetailRecipePresenterImpl
import dagger.Module
import dagger.Provides

/**
 * Created by rubendominguez on 19/6/18.
 */
@Module
class DetailRecipeModule {
    @Provides
    @ActivityScope
    internal fun providesDetailRecipePresenter(): DetailRecipePresenter = DetailRecipePresenterImpl()
}