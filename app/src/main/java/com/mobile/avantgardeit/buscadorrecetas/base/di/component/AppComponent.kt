package com.mobile.avantgardeit.buscadorrecetas.base.di.component

import android.app.Application
import android.content.res.Resources
import com.google.gson.Gson
import com.mobile.avantgardeit.buscadorrecetas.base.api.Endpoints
import com.mobile.avantgardeit.buscadorrecetas.base.di.module.ApiModule
import com.mobile.avantgardeit.buscadorrecetas.base.di.module.AppModule
import com.mobile.avantgardeit.buscadorrecetas.base.di.module.OkHttpModule
import com.mobile.avantgardeit.buscadorrecetas.base.di.module.RetrofitModule
import dagger.Component
import io.reactivex.disposables.CompositeDisposable
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, RetrofitModule::class, ApiModule::class, OkHttpModule::class))
interface AppComponent {
    fun application(): Application
    fun gson(): Gson
    fun resources(): Resources
    fun retrofit(): Endpoints
    fun cache(): Cache
    fun client(): OkHttpClient
    fun loggingInterceptor(): HttpLoggingInterceptor
    fun compositeDisposable(): CompositeDisposable

}