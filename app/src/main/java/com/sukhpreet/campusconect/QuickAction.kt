package com.sukhpreet.campusconect

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Forum
import androidx.compose.material.icons.filled.Groups
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class QuickAction(
    val icon: ImageVector,
    val title: String,
    val tint: Color
)

val actions = listOf(
    QuickAction(
        icon = Icons.AutoMirrored.Filled.Article,
        title = "Stay Updated",
        tint = Color(0xFFC64ED8)
    ),
    QuickAction(
        icon = Icons.Filled.Event,
        title = "Events",
        tint = Color(0xFF4D6FFF)
    ),
    QuickAction(
        icon = Icons.Filled.Groups,
        title = "Connect",
        tint = Color(0xFF34D399)
    ),
    QuickAction(
        icon = Icons.Filled.Forum,
        title = "Engage",
        tint = Color(0xFFF97316)
    )
)