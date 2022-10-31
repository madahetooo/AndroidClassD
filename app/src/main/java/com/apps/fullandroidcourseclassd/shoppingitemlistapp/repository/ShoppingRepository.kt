package com.apps.fullandroidcourseclassd.shoppingitemlistapp.repository

import com.apps.fullandroidcourseclassd.shoppingitemlistapp.db.ShoppingDatabase
import com.apps.fullandroidcourseclassd.shoppingitemlistapp.model.ShoppingItem

class ShoppingRepository(private val db:ShoppingDatabase) {

    fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    fun delete (item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItem()

}