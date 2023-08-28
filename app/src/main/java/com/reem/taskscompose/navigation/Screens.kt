package com.reem.taskscompose.navigation

import androidx.navigation.NavHostController
import com.reem.taskscompose.util.Action
import com.reem.taskscompose.util.Constants.LIST_SCREEN

class Screens(navHostController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navHostController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navHostController.navigate("task/$taskId")
    }
}