package com.hardik.safehaven.feature_home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

// UI should reflect CURRENT STATE
// LOGIC should live OUTSIDE UI
// STATE CHANGES should be PREDICTABLE

@Composable
fun HomeScreen(
    onAddClick: () -> Unit,
    onViewClick: () -> Unit,
    viewModel: HomeViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle() // subscribe to state changes and Keep UI in sync.
    // why collectAsStateWithLifecycle() ?
    //  Stops collecting when screen is not visible
    //  Prevents memory leaks
    //  handles lifecycle automatically

    LaunchedEffect(Unit) {
        viewModel.loadItems()
    } // LaunchedEffect tell that run this once when the screen enters composition
    // composables can recompose multiple times
    // you do not want to call loadItems(), every recompose

    Column {
        Text("Items: ${state.items.size}")
        Button(onClick = onAddClick) { Text("Add Item") }
        Button(onClick = onViewClick) { Text("View Item") }
    }
}