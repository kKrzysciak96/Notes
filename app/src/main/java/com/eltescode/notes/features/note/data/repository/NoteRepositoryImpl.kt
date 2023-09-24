package com.eltescode.notes.features.note.data.repository

import com.eltescode.notes.features.note.data.data_source.NoteDao
import com.eltescode.notes.features.note.domain.model.NoteDomain
import com.eltescode.notes.features.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao: NoteDao): NoteRepository {

    override fun getAllNotes(): Flow<List<NoteDomain>> {
        return dao.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): NoteDomain? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(noteDomain: NoteDomain) {
        dao.insertNote(noteDomain)
    }

    override suspend fun deleteNote(noteDomain: NoteDomain) {
        dao.deleteNote(noteDomain)
    }
}