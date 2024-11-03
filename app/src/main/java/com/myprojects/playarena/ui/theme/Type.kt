package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.myprojects.playarena.R

val Inter = FontFamily(
    Font(
        resId = R.font.inter_pt_regular,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_medium,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_semibold,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_bold,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_extrabold,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_black,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_thin,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_extralight,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_light,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.inter_pt_semibolditalic,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.inter_pt_bolditalic,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.inter_pt_mediumitalic,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.inter_pt_extrabolditalic,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.inter_pt_blackitalic,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.inter_pt_thinitalic,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.inter_pt_extralightitalic,
        style = FontStyle.Italic
    ),
    Font(
        resId = R.font.inter_pt_lightitalic,
        style = FontStyle.Italic
    )
)

val AppTypography = Typography(
    bodySmall = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
