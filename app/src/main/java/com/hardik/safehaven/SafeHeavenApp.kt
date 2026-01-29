package com.hardik.safehaven

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.hardik.safehaven.core.navigation.AppNavGraph
import com.hardik.safehaven.data.repository.FakeSecureItemRepository

@Composable
fun SafeHeavenApp() {

    val navController = rememberNavController()
    val repository = remember {
        FakeSecureItemRepository()
    }
    AppNavGraph(navController = navController, repository)
}