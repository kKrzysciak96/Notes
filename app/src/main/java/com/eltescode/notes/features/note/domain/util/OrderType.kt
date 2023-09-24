package com.eltescode.notes.features.note.domain.util

sealed class OrderType{
    object Ascending : OrderType()
    object Descending : OrderType()
}
