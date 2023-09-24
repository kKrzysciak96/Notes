package com.eltescode.notes.features.note.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class NoteDomain(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {

    companion object {
        val noteColors = listOf(
            Color(0XFF5b39c6),
            Color(0XFFba160c),
            Color(0XFFe0af1f),
            Color(0XFF33cc5a),
            Color(0XFF8bbe1b)
        )
    }
}

class InvalidNoteException(message: String) : Exception(message)
