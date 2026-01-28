package com.hardik.safehaven.data.repository

import com.hardik.safehaven.domain.model.SecureItem

interface SecureItemRepository {

    fun getItems(): List<SecureItem>
    fun getItemById(id: String): SecureItem?
    fun addItem(item: SecureItem)
    fun deleteItem(id: String)

}