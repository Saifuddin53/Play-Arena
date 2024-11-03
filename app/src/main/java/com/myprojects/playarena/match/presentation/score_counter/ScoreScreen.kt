package com.myprojects.playarena.match.presentation.score_counter

import android.content.pm.ActivityInfo
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.myprojects.playarena.MainActivity
import com.myprojects.playarena.match.domain.Match

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
        modifier = modifier
    )
}

@Composable
fun ScoreScreenContent(
    match: Match,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Score Screen")
    }
}