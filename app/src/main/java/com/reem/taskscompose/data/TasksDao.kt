package com.reem.taskscompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.RoomMasterTable.TABLE_NAME
import androidx.room.Update
import com.reem.taskscompose.data.models.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TasksDao {
    @Query("SELECT * FROM $TABLE_NAME ORDER BY id ASC")
    fun getAllTasks(): Flow<List<Task>>

    @Query("SELECT * FROM $TABLE_NAME WHERE id=:taskId")
    fun getSelectedTask(taskId: Int): Flow<Task>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(task: Task)

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("DELETE FROM $TABLE_NAME")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM $TABLE_NAME WHERE title LIKE :query OR description LIKE :query")
    fun searchDatabase(query: String): Flow<List<Task>>

    @Query("SELECT * FROM $TABLE_NAME ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): Flow<List<Task>>
}