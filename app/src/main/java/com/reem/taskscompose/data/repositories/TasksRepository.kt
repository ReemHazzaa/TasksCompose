package com.reem.taskscompose.data.repositories

import com.reem.taskscompose.data.TasksDao
import com.reem.taskscompose.data.models.Task
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class TasksRepository @Inject constructor(private val tasksDao: TasksDao) {
    val getAllTasks: Flow<List<Task>> = tasksDao.getAllTasks()
    val sortByLowPriority: Flow<List<Task>> = tasksDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<Task>> = tasksDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<Task> {
        return tasksDao.getSelectedTask(taskId)
    }

    suspend fun addTask(task: Task) {
        tasksDao.addTask(task = task)
    }

    suspend fun updateTask(task: Task) {
        tasksDao.updateTask(task = task)
    }

    suspend fun deleteTask(task: Task) {
        tasksDao.deleteTask(task = task)
    }

    suspend fun deleteAllTasks() {
        tasksDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<Task>> {
        return tasksDao.searchDatabase(query = searchQuery)
    }

}