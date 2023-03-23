package com.example.yoonchang.udemyfoody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
 import com.example.yoonchang.udemyfoody.models.FoodRecipe
import com.example.yoonchang.udemyfoody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}