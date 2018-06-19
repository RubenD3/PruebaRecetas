package com.mobile.avantgardeit.buscadorrecetas.base

import android.app.Application
import com.mobile.avantgardeit.buscadorrecetas.base.di.component.AppComponent
import com.mobile.avantgardeit.buscadorrecetas.base.di.component.DaggerAppComponent
import com.mobile.avantgardeit.buscadorrecetas.base.di.module.AppModule

/**
 * Created by rubendominguez on 18/6/18.
 */
class BuscadorRecetasApp : Application() {


    companion object{
        @JvmStatic lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }
}