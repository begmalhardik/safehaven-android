package com.hardik.safehaven.core.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hardik.safehaven.feature_add.AddItemScreen
import com.hardik.safehaven.feature_home.HomeScreen
import com.hardik.safehaven.feature_view.ViewItemScreen

// what we did -
// I)   created screens (UI) first
// II)  Then wire navigation (co-ordinator)
// III) instead of navigation, magically created screens (separation = testing + sanity)

@Composable
fun AppNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onAddClick = { navController.navigate(Screen.AddItem.route) },
                onViewClick = { navController.navigate(Screen.ViewItem.route) }
            )
        }

        composable(Screen.AddItem.route) {
            AddItemScreen(
                onBack = { navController.popBackStack() }
            )
        }

        composable(Screen.ViewItem.route) {
            ViewItemScreen(
                onBack = { navController.popBackStack() }
            )
        }

        composable(Screen.Settings.route) {
            Text("Settings (Coming Soon)")
        }
    }
}