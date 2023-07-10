package com.reem.taskscompose.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.reem.taskscompose.data.models.Task
import com.reem.taskscompose.data.repositories.TasksRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: TasksRepository
) : ViewModel() {

    private val _allTasks =
        MutableStateFlow<List<Task>>(emptyList())

    val allTasks: StateFlow<List<Task>> = _allTasks

    fun getAllTasks() {
        viewModelScope.launch {
            repository.getAllTasks.collect {
                _allTasks.value = it
            }
        }
    }

}