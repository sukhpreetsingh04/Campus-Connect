package com.sukhpreet.campusconect.components

import com.sukhpreet.campusconect.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sukhpreet.campusconect.ui.theme.Poppins
import androidx.compose.ui.res.stringResource

@Composable
fun PrimaryButton() {

    val appFontFamily = Poppins;

    val buttonGradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF4D6FFF),
            Color(0xFF6A5BFF),
            Color(0xFFC64ED8)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 10.dp,
                end = 10.dp,
                bottom = 5.dp
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
            Text(
                text = stringResource(R.string.get_started),
                fontFamily = appFontFamily,
                fontSize = 20.sp
            )
            Spacer(Modifier.width(8.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}