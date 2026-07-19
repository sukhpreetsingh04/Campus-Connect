package com.sukhpreet.campusconect

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp

@Composable
fun WelcomeScreen() {

    val buttonGradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF4D6FFF),
            Color(0xFF6A5BFF),
            Color(0xFFC64ED8)
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFE3F2FD))
            .padding(top = 32.dp),
        verticalArrangement = Arrangement.SpaceBetween,
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
                buttonGradient
            ),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 40.sp
        )

        Text(text = "Your campus. Your Community.", fontFamily = Poppins, color = Color.Black)
        Text(text = "All in One Place.", fontFamily = Poppins, color = Color(0xFF4D6FFF))

        Spacer(modifier = Modifier.weight(2f))

        QuickActionsCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    bottom = 40.dp
                )
                .clip(RoundedCornerShape(16.dp))
                .background(buttonGradient, RoundedCornerShape(16.dp))
        ) {
            Button(
                onClick = { /*TODO*/ },
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 0.dp
                )
            ) {
                Text(text = "Get Started", fontFamily = Poppins, fontSize = 20.sp)
                Spacer(Modifier.width(8.dp))
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
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
    }
}