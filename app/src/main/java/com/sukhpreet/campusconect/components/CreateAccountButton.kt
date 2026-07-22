package com.sukhpreet.campusconect.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sukhpreet.campusconect.R
import com.sukhpreet.campusconect.ui.theme.Poppins

@Composable
fun CreateAccountButton() {

    val appFontFamily = Poppins

    Button(
        onClick = { "" },
        modifier = Modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF4D6FFF),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = stringResource(R.string.create_an_account),
            fontFamily = appFontFamily,
            fontSize = 14.sp
        )
    }
}