package com.eltescode.notes.features.note.domain.use_case

import com.eltescode.notes.features.note.domain.model.InvalidNoteException
import com.eltescode.notes.features.note.domain.model.NoteDomain
import com.eltescode.notes.features.note.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(noteDomain: NoteDomain){
        if (noteDomain.title.isBlank()){
            throw InvalidNoteException("Title can not be blank")
        }
        repository.insertNote(noteDomain)
    }
}