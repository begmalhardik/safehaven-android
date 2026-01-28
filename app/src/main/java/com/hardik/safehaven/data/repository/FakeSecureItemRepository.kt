package com.hardik.safehaven.data.repository

import com.hardik.safehaven.domain.model.SecureItem

class FakeSecureItemRepository : SecureItemRepository {

    private val items = mutableListOf<SecureItem>()

    override fun getItems(): List<SecureItem> = items

    override fun getItemById(id: String): SecureItem? = items.find { it.id == id }

    override fun addItem(item: SecureItem) {
        items.add(item)
    }

    override fun deleteItem(id: String) {
        items.removeAll { it.id == id }
    }
}