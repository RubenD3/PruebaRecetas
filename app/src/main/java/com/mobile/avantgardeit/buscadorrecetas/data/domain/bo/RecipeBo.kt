package com.mobile.avantgardeit.buscadorrecetas.data.domain.bo

import java.io.Serializable

/**
 * Created by rubendominguez on 18/6/18.
 */
data class RecipeBo (val title : String, val href : String, val ingredients : String, val thumbnail : String ) : Serializable