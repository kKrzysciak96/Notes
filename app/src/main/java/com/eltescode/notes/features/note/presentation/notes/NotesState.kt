package com.eltescode.notes.features.note.presentation.notes

import com.eltescode.notes.features.note.domain.model.NoteDomain
import com.eltescode.notes.features.note.domain.util.NoteOrder
import com.eltescode.notes.features.note.domain.util.OrderType

data class NotesState(
    val notes: List<NoteDomain> = emptyList(),
    val noteOrder : NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
