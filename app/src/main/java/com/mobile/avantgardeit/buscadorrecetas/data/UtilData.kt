package com.mobile.avantgardeit.buscadorrecetas.data

import retrofit2.Call

/**
 * Created by rubendominguez on 18/6/18.
 */
inline fun <T, U> Call<T>.unwrapCall(f: T.() -> U) = execute().body()?.f()