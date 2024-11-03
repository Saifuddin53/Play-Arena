package com.myprojects.playarena.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.myprojects.playarena.core.domain.Player
import com.myprojects.playarena.home.presentation.HomeScreen
import com.myprojects.playarena.match.domain.Match
import com.myprojects.playarena.match.domain.MatchStatus
import com.myprojects.playarena.match.domain.MatchType
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
                match = Match(
                    id = "1",
                    player1 = Player(
                        "1",
                        "Saifuddin",
                        ""
                    ),
                    player2 = Player(
                        "1",
                        "Saifuddin",
                        ""
                    ),
                    player1Score = 0,
                    player2Score = 0,
                    player1Color = Color.Blue,
                    player2Color = Color.Red,
                    matchStatus = MatchStatus.ONGOING,
                    matchType = MatchType.DOUBLES,
                    matchResult = "",
                    table = 1
                ),
                modifier = modifier
            )
        }
    }
}