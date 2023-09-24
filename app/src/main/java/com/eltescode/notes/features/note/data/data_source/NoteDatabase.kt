package com.eltescode.notes.features.note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.eltescode.notes.features.note.domain.model.NoteDomain

@Database(entities = [NoteDomain::class], version = 1)
abstract class NoteDatabase:RoomDatabase() {

    abstract fun provideDao(): NoteDao

    companion object{
        const val DATA_BASE_NAME = "notes_data_base"
    }
}