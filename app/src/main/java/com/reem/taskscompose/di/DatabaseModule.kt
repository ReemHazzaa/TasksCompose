package com.reem.taskscompose.di

import android.content.Context
import androidx.room.Room
import com.reem.taskscompose.data.TasksDao
import com.reem.taskscompose.data.TasksDatabase
import com.reem.taskscompose.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        TasksDatabase::class.java,
        DATABASE_NAME,
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: TasksDatabase) = database.tasksDao()
}