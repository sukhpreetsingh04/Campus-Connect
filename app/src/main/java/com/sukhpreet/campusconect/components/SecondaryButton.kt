package com.sukhpreet.campusconect.components

import com.sukhpreet.campusconect.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sukhpreet.campusconect.ui.theme.Poppins
import androidx.compose.ui.res.stringResource

@Composable
fun SecondaryButton() {

    val appFontFamily = Poppins

    val accountButtonGradient = ButtonDefaults.buttonColors(
        containerColor = Color.White,
        contentColor = Color(0xFF4D6FFF)
    )

    val accountButtonBorderStroke = BorderStroke(
        width = 1.dp,
        color = Color(0xFF4D6FFF)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 5.dp,
                start = 10.dp,
                end = 10.dp,
                bottom = 10.dp
            )
            .clip(RoundedCornerShape(10.dp))
    ) {
        Button(
            onClick = {/*TODO*/ },
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .fillMaxWidth(),
            colors = accountButtonGradient,
            border = accountButtonBorderStroke,
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = stringResource(R.string.already_have_account),
                fontFamily = appFontFamily,
                fontSize = 20.sp
            )
        }
    }
}