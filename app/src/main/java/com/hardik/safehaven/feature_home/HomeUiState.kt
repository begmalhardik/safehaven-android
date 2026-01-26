package com.hardik.safehaven.feature_home

// what we DON'T DO
//  MutableState everywhere
//  Logic in COMPOSABLES
//  Random VARIABLES

// What we DO
//  One UiState DataClass
//  One StateFlow
//  UI only observes

data class HomeUiState(
    val items: List<String> = emptyList(),
    val isLoading: Boolean = false
)
// At any given moment, how does home screen look like? - this data class tells that ....
// NOT how it looks,( color, padding)
// But WHAT DATA IT IS SHOWING

