package com.example.yoonchang.udemyfoody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.yoonchang.udemyfoody.util.Constants.Companion.FAVORITE_RECIPES_TABLE
import com.example.yoonchang.udemyfoody.models.Result

@Entity(tableName = FAVORITE_RECIPES_TABLE)
data class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)