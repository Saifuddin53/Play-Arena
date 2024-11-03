package com.myprojects.playarena.match.presentation.score_counter.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import com.myprojects.playarena.core.domain.Player

@Composable
fun PlayerScoreContainer(
    player: Player,
    score: Int,
    containerColor: Color,
    contentColor: Color,
    side: String,
    isServing: Boolean,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(color = containerColor)
    ) {
       Text(
           text = score.toString(),
       )
    }
}