package com.mobile.avantgardeit.buscadorrecetas.presentation.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.mobile.avantgardeit.buscadorrecetas.R
import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import android.view.View
import com.mobile.avantgardeit.buscadorrecetas.presentation.general.loadUrl
import kotlinx.android.synthetic.main.recipe_list.view.*

class RecipeAdapter(val items : ArrayList<RecipeBo>,val listener: (RecipeBo) -> Unit) : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =holder.bind(items[position],listener)

    override fun getItemCount() = items.size


    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvTitle = view.tv_title_recipe
        val tvIngredients = view.tv_ingredient_recipe
        val ivImage = view.iv_photo



        fun bind(item: RecipeBo,listener: (RecipeBo) -> Unit) = with(itemView) {
            tvTitle.text = item.title
            tvIngredients.text = item.ingredients
            ivImage.loadUrl(item.thumbnail)
            setOnClickListener { listener(item) }
        }
    }
}