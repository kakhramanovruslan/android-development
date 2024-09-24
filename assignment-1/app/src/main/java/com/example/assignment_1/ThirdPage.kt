package com.example.assignment_1

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


class ThirdPage {

    private val poppinsFontFamily = FontFamily(
        Font(R.font.poppins, FontWeight.Normal)
    )

    @SuppressLint("NotConstructor")
    @Preview
    @Composable
    fun ThirdPage(){
            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(43, 192, 138, (0.05 * 255).toInt())),
            ){
                Text(text="45")
            }
        }
    }
