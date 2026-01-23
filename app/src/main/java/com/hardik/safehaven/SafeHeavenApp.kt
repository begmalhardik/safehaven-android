package com.hardik.safehaven

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.hardik.safehaven.core.navigation.AppNavGraph

@Composable
fun SafeHeavenApp() {

    val navController = rememberNavController()
    AppNavGraph(navController = navController)
}