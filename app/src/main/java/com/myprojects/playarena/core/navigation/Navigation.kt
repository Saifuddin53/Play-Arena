package com.myprojects.playarena.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.myprojects.playarena.home.presentation.HomeScreen
import com.myprojects.playarena.match.presentation.score_counter.ScoreScreen

@Composable
fun PlayArenaNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                modifier = modifier
            ) {
                navController.navigate(Screen.Match.route)
            }
        }

        composable(Screen.Match.route) {
            ScoreScreen(
                modifier = modifier
            )
        }
    }
}