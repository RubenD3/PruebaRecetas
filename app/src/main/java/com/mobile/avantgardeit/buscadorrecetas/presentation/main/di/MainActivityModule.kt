package com.mobile.avantgardeit.buscadorrecetas.presentation.main.di

import com.mobile.avantgardeit.buscadorrecetas.base.api.Endpoints
import com.mobile.avantgardeit.buscadorrecetas.base.di.ActivityScope
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.interactor.GetRecipeUseCase
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.interactor.GetRecipeUseCaseImpl
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.presenter.MainPresenter
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.presenter.MainPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    @ActivityScope
    internal fun providesMainPresenter(getRecipeUseCase:GetRecipeUseCase): MainPresenter = MainPresenterImpl(getRecipeUseCase)

    @Provides
    @ActivityScope
    internal fun providesGetRecipeUseCase (api : Endpoints): GetRecipeUseCase = GetRecipeUseCaseImpl(api)
}