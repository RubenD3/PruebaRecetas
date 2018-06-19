package com.mobile.avantgardeit.buscadorrecetas.presentation.general

import android.widget.ImageView
import com.mobile.avantgardeit.buscadorrecetas.R
import com.squareup.picasso.Picasso

/**
 * Created by rubendominguez on 19/6/18.
 */
fun ImageView.loadUrl (url : String){

    if(url.isEmpty()){
        Picasso.with(context).load(R.drawable.recipe).into(this)
    }else{
        Picasso.with(context).load(url).error(R.drawable.recipe).into(this)
    }

}