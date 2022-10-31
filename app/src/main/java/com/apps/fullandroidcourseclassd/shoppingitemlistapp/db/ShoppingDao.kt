package com.apps.fullandroidcourseclassd.shoppingitemlistapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.apps.fullandroidcourseclassd.shoppingitemlistapp.model.ShoppingItem
@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun upsert(item: ShoppingItem)

    @Delete
     fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItem(): LiveData<List<ShoppingItem>>
}