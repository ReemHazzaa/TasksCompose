package com.reem.taskscompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.reem.taskscompose.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
