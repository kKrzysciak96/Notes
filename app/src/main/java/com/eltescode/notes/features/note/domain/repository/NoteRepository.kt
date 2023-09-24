package com.eltescode.notes.features.note.domain.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.eltescode.notes.features.note.data.data_source.NoteDao
import com.eltescode.notes.features.note.domain.model.NoteDomain
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getAllNotes(): Flow<List<NoteDomain>>

    suspend fun getNoteById(id: Int) : NoteDomain?

    suspend fun insertNote(noteDomain: NoteDomain)

    suspend fun deleteNote(noteDomain: NoteDomain)
}