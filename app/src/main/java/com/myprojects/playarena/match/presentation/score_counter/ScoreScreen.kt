package com.myprojects.playarena.match.presentation.score_counter

import android.content.pm.ActivityInfo
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.ui.theme.AppTypography
import com.myprojects.playarena.MainActivity
import com.myprojects.playarena.match.domain.Match
import com.myprojects.playarena.match.presentation.score_counter.components.PlayerScoreContainer

@Composable
fun ScoreScreen(
    match: Match,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val activity = context as MainActivity

    DisposableEffect(Unit) {
        activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        onDispose {
            activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        }
    }

    ScoreScreenContent(
        match = match,
        modifier = Modifier
    )
}

@Composable
fun ScoreScreenContent(
    match: Match,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
        ) {
            PlayerScoreContainer(
                player = match.player1,
                score = match.player1Score,
                containerColor = match.player1Color,
                contentColor = match.player2Color,
                side = "Left",
                isServing = true,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
            PlayerScoreContainer(
                player = match.player2,
                score = match.player2Score,
                containerColor = match.player2Color,
                contentColor = match.player1Color,
                side = "Left",
                isServing = true,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
        }
    }
}