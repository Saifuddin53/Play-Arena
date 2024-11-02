package com.myprojects.playarena.core.navigation

sealed class Screen(
    val route: String,
) {
    data object Home : Screen("home")
    data object Match : Screen("match")
    data object Profile : Screen("profile")
    data object Settings : Screen("settings")
}