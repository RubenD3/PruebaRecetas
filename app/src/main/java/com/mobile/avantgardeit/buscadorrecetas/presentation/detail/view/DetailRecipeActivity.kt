package com.mobile.avantgardeit.buscadorrecetas.presentation.detail.view

import android.os.Bundle
import com.mobile.avantgardeit.buscadorrecetas.R
import com.mobile.avantgardeit.buscadorrecetas.base.BaseActivity
import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.di.DaggerDetailRecipeComponent
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.di.DetailRecipeModule
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.presenter.DetailRecipePresenter
import com.mobile.avantgardeit.buscadorrecetas.presentation.general.loadUrl
import kotlinx.android.synthetic.main.activity_detail_recipe.*
import javax.inject.Inject

/**
 * Created by rubendominguez on 19/6/18.
 */
class DetailRecipeActivity : BaseActivity(), DetailRecipeView {

    @Inject
    lateinit var presenter : DetailRecipePresenter

    companion object {
        val EXTRA_RECIPE = "DetailRecipeActivity:recipe"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recipe)

        presenter.load(intent.extras.get(EXTRA_RECIPE) as RecipeBo)


    }

    override fun setTitle(title: String) {
        tv_title_recipe_cv.text = title
    }

    override fun setIngredients(ingredients: String) {
        tv_ingredients_recipe_cv.text = ingredients
    }

    override fun setUrl(url: String) {
        tv_url_recipe_cv.text = url
    }

    override fun loadPhoto(urlPhoto: String) {
        toolbarImage.loadUrl(urlPhoto)
    }



    override fun onActivityInject() {
        DaggerDetailRecipeComponent.builder().appComponent(getAppcomponent())
                .detailRecipeModule(DetailRecipeModule())
                .build()
                .inject(this)

        presenter.viewAttach(this)
    }

}