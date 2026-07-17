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
    val subtitle: String,
    val tint: Color
)

val actions = listOf(
    QuickAction(
        icon = Icons.AutoMirrored.Filled.Article,
        title = "Stay Updated",
        subtitle = "Latest campus news",
        tint = Color(0xFFC64ED8)
    ),
    QuickAction(
        icon = Icons.Filled.Event,
        title = "Events",
        subtitle = "Discover events",
        tint = Color(0xFF4D6FFF)
    ),
    QuickAction(
        icon = Icons.Filled.Groups,
        title = "Connect",
        subtitle = "Connect with peers",
        tint = Color(0xFF4D6FFF)
    ),
    QuickAction(
        icon = Icons.Filled.Forum,
        title = "Engage",
        subtitle = "Engage in discussions",
        tint = Color(0xFF4D6FFF)
    )
)