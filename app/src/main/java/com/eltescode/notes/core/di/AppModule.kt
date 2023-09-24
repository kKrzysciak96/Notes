package com.eltescode.notes.core.di

import android.app.Application
import androidx.room.Room
import com.eltescode.notes.features.note.data.data_source.NoteDatabase
import com.eltescode.notes.features.note.data.repository.NoteRepositoryImpl
import com.eltescode.notes.features.note.domain.repository.NoteRepository
import com.eltescode.notes.features.note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATA_BASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providesNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.provideDao())
    }

    @Provides
    @Singleton
    fun providesNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            getNoteUseCase = GetNoteUseCase(repository),
            addNoteUseCase = AddNoteUseCase(repository)
        )
    }
}