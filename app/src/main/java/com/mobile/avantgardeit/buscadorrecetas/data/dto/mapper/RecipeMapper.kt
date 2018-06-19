package com.mobile.avantgardeit.buscadorrecetas.data.dto.mapper

import com.mobile.avantgardeit.buscadorrecetas.data.domain.bo.RecipeBo
import com.mobile.avantgardeit.buscadorrecetas.data.dto.RecipeResponseDto
import com.mobile.avantgardeit.buscadorrecetas.data.dto.ResultResponseDto

/**
 * Created by rubendominguez on 18/6/18.
 */
class RecipeMapper {

    fun getRecipeBo(responseDto: ResultResponseDto) : RecipeBo = RecipeBo(responseDto.title,responseDto.href,responseDto.ingredients,responseDto.thumbnail)


    fun getRecipeListBo(responseDto: RecipeResponseDto) : ArrayList<RecipeBo> {

        val list = ArrayList<RecipeBo>()

        responseDto.results.forEach{
            list.add(getRecipeBo(it))
        }

        return list

    }

}