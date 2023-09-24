package com.eltescode.notes.features.note.domain.use_case

import com.eltescode.notes.features.note.domain.model.NoteDomain
import com.eltescode.notes.features.note.domain.repository.NoteRepository

class GetNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(id: Int):NoteDomain?{
        return repository.getNoteById(id)
    }
}