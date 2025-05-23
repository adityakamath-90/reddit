package com.awesome.notes.di

import android.content.Context
import androidx.room.Room
import com.awesome.notes.database.NotesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun providesNiaDatabase(
        @ApplicationContext context: Context,
    ): NotesDatabase = Room.databaseBuilder(
        context,
        NotesDatabase::class.java,
        "notes-database",
    ).build()
}

