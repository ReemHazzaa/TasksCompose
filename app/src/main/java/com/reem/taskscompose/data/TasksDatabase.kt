package com.reem.taskscompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.reem.taskscompose.data.models.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TasksDatabase : RoomDatabase() {
    abstract fun tasksDao(): TasksDao
}