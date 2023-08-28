package com.reem.taskscompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.reem.taskscompose.util.Constants.LIST_SCREEN

@Composable
fun setupNavigation(
    navHostController: NavHostController
) {
    val screen = remember(navHostController) {
        Screens(navHostController)
    }

    NavHost(navController = navHostController, startDestination = LIST_SCREEN) {
        
    }
}