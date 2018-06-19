package com.mobile.avantgardeit.buscadorrecetas.presentation.main.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.SearchView
import com.mobile.avantgardeit.buscadorrecetas.R
import com.mobile.avantgardeit.buscadorrecetas.base.BaseActivity
import com.mobile.avantgardeit.buscadorrecetas.base.mvp.BaseView
import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import com.mobile.avantgardeit.buscadorrecetas.presentation.detail.view.DetailRecipeActivity
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.adapter.RecipeAdapter
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.di.DaggerMainActivityComponent
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.di.MainActivityModule
import com.mobile.avantgardeit.buscadorrecetas.presentation.main.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {


    @Inject
    lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchView.queryHint = "Search the recipe"

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                presenter.search(newText)
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                //Task HERE
                presenter.search(query)
                return false
            }

        })

    }


    override fun onActivityInject() {
        DaggerMainActivityComponent.builder().appComponent(getAppcomponent())
                .mainActivityModule(MainActivityModule())
                .build()
                .inject(this)

        presenter.viewAttach(this)
    }

    override fun showRecipes(list: ArrayList<RecipeBo>) {
        runOnUiThread {
            //stuff that updates ui
            val linearLayoutManager = LinearLayoutManager(applicationContext)
            linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
            rv_recipe.layoutManager = linearLayoutManager
            rv_recipe.adapter = RecipeAdapter(list){
                startActivity<DetailRecipeActivity>(DetailRecipeActivity.EXTRA_RECIPE to it)
            }
        }

    }

}
