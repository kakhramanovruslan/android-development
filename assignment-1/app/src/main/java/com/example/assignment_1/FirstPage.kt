package com.example.assignment_1

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class FirstPage {

    private val poppinsFontFamily = FontFamily(
        Font(R.font.poppins, FontWeight.Normal)
    )

    @SuppressLint("NotConstructor")
    @Preview
    @Composable
    fun FirstPage () {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF12AA73),
                            Color(0xCF135B46)
                        )
                    )
                )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize().padding(top = 86.dp)
            ){
                Column (
                    modifier = Modifier
                        .width(200.dp)
                        .height(280.76.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.smartr_logo),
                        contentDescription = "Smartr Logo",
                        modifier = Modifier
                            .width(98.dp)
                            .height(20.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.sign_up_man),
                        contentDescription = "Sign Up Man",
                        modifier = Modifier
                            .width(200.dp)
                            .height(211.dp)
                    )
                }

                Text(
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 24.sp,
                        lineHeight = 31.sp,
                        letterSpacing = 0.25.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFF4F4F4)
                    ),
                    modifier = Modifier
                        .padding(top = 19.8.dp),
                    text = "Fresh look, same login."
                )

                FirstPageRowItems("SmartRecruiters candidate portal       is now Smartr.", R.drawable.icon, PaddingValues(top = 34.76.dp))
                FirstPageRowItems("Enter the same login info used for your SmartrProfile", R.drawable.log_in, PaddingValues(top = 34.46.dp))
                FirstPageRowItems("If login details were saved, you may    need to re-save.", R.drawable.refresh, PaddingValues(top = 28.68.dp))

                Text(
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 10.sp,
                        lineHeight = 13.sp,
                        letterSpacing = 0.25.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFF4F4F4)
                    ),
                    modifier = Modifier
                        .padding(top = 48.43.dp, bottom = 8.99.dp),

                    text = "Why Smartr? Read here"
                )

                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(274.dp)
                        .height(42.dp)
                        .shadow(8.dp, shape = RoundedCornerShape(30.dp))
                        .background(Color(0xFFBFDBD1), shape = RoundedCornerShape(30.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFBFDBD1)
                    )
                ) {
                    Text(
                        style = TextStyle(
                            fontFamily = poppinsFontFamily,
                            fontSize = 15.sp,
                            lineHeight = 15.sp,
                            letterSpacing = 1.sp,
                            color = Color(0xFF135B46),
                            fontWeight = FontWeight(700)
                        ),
                        text = "GET STARTED")
                }

            }
        }
    }

    @Composable
    fun FirstPageRowItems (text: String, imageResourceId: Int, rowPaddingValues: PaddingValues) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(rowPaddingValues)
                .width(160.dp)
        ){
            Image(
                painter = painterResource(id = imageResourceId),
                contentDescription = "Image of Item",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 16.dp)
            )
            Text(
                style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 12.sp,
                    lineHeight = 15.6.sp,
                    letterSpacing = 0.25.sp,
                    color = Color(0xFFF4F4F4)
                ),
                text = text
            )
        }
    }
}