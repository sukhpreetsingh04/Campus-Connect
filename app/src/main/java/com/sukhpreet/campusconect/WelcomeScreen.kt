package com.sukhpreet.campusconect

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sukhpreet.campusconect.ui.theme.Poppins
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFE3F2FD)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Campus",
            fontFamily = Poppins,
            color = Color(0xFF1E245B),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp,
        )
        Text(
            text = "Connect",
            fontFamily = Poppins,
            style = TextStyle(
                Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF4D6FFF),
                        Color(0xFF6A5BFF),
                        Color(0xFFC64ED8)
                    )
                )
            ),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Your campus. Your Community.", fontFamily = Poppins, color = Color.Black)
        Text(text = "All in One Place.", fontFamily = Poppins, color = Color(0xFF4D6FFF))

        Spacer(modifier = Modifier.weight(1f))

        QuickActionsCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 200.dp)
        )
    }
}

@Composable
fun QuickActionsCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(16.dp),
        border = CardDefaults.outlinedCardBorder(enabled = true),
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

@Composable
fun QuickActionItem(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    iconSize: Dp = 28.dp,
    title: String,
    subtitle: String,
    tint: Color
) {
    Column(
        modifier = modifier
            .padding(start = 8.dp, end = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = tint,
            modifier = Modifier.size(iconSize),
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = title,
            textAlign = TextAlign.Center
        )
        Text(text = subtitle, textAlign = TextAlign.Center, fontSize = 12.sp)
    }
}