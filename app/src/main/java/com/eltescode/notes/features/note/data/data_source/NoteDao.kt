package com.eltescode.notes.features.note.data.data_source

import androidx.room.*
import com.eltescode.notes.features.note.domain.model.NoteDomain
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note_table")
    fun getAllNotes(): Flow<List<NoteDomain>>

    @Query("SELECT * FROM note_table WHERE id = :id")
    suspend fun getNoteById(id: Int) : NoteDomain?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(noteDomain: NoteDomain)

    @Delete
    suspend fun deleteNote(noteDomain: NoteDomain)
}