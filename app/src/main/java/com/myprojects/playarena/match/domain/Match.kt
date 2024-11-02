package com.myprojects.playarena.match.domain

import com.myprojects.playarena.core.domain.Player

data class Match(
    val id: String,
    val table: Int,
    val player1: Player,
    val player2: Player,
    val matchType: MatchType,
    val matchStatus: MatchStatus,
    val player1Score: Int,
    val player2Score: Int,
    val matchResult: MatchResult?
)