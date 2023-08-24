package com.reem.taskscompose.navigation

import androidx.navigation.NavHostController
import com.reem.taskscompose.util.Action

class Screens(navHostController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navHostController.navigate("list/${action.name}")
    }
}