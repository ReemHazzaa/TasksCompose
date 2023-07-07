package com.reem.taskscompose.data

import androidx.room.Database
import com.reem.taskscompose.data.models.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TasksDatabase {
    abstract fun tasksDao(): TasksDao
}