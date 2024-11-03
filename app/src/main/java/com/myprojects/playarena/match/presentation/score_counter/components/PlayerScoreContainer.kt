package com.myprojects.playarena.match.presentation.score_counter.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.AppTypography
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
            style = AppTypography.headlineMedium.copy(
                fontSize = 64.sp
            ),
            modifier = Modifier
                .align(Alignment.Center)
        )

        Text(
            text = score.toString(),
            style = AppTypography.headlineMedium.copy(
                fontSize = 64.sp
            ),
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.BottomCenter)
        )
    }
}

@Preview
@Composable
fun PlayerScoreContainerPreview(modifier: Modifier = Modifier) {
    PlayerScoreContainer(
        player = Player(
            id = "1",
            name = "Saifuddin",
            profilePicture = ""
        ),
        score = 0,
        containerColor = Color.Blue,
        contentColor = Color.Red,
        side = "Left",
        isServing = true,
        modifier = modifier
    )
}

