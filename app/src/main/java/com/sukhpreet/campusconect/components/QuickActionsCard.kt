package com.sukhpreet.campusconect.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun QuickActionsCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            actions.forEachIndexed { index, action ->

                QuickActionItem(
                    modifier = Modifier.weight(1f),
                    icon = action.icon,
                    iconSize = 32.dp,
                    title = action.title,
                    subtitle = action.subtitle,
                    tint = action.tint
                )

                if (index != actions.lastIndex) {
                    VerticalDivider(
                        modifier = Modifier
                            .fillMaxHeight(0.55f)
                            .width(1.dp),
                        color = Color(0xFFEAEAEA)
                    )
                }
            }
        }
    }
}