package com.reem.taskscompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.RoomMasterTable.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
