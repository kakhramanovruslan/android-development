package com.example.assignment_1

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
                    .background(Color(43, 192, 138, (0.25 * 255).toInt())),
            ){
                Column(){
                    FirstSection()
                    Spacer(modifier = Modifier.height(5.dp))
                    SecondSection()
                    Spacer(modifier = Modifier.height(5.dp))
                    ThirdSection()
                    Spacer(modifier = Modifier.height(5.dp))
                    FourthSection()
                }
            }
        }

    @Composable
    fun FirstSection(){
            Box(
                modifier = Modifier
                    .width(411.dp)
                    .height(229.dp)
                    .background(color = Color(255, 255, 255, 255))
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 24.dp, top = 32.dp, end = 24.dp, bottom = 20.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.arrow_back_24px),
                            contentDescription = "",
                            modifier = Modifier
                                .size(24.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.favorite_border_24px),
                            contentDescription = "",
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(25.dp))

                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.rectangle_canva),
                            contentDescription = "",
                            modifier = Modifier
                                .size(60.dp)
                        )

                        Text(
                            style = TextStyle(
                                fontFamily = poppinsFontFamily,
                                fontSize = 24.sp,
                                lineHeight = 26.4.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0, 0, 0, 255)
                            ),
                            text = "Junior UX Designer"
                        )

                        Text(
                            style = TextStyle(
                                fontFamily = poppinsFontFamily,
                                fontSize = 14.sp,
                                lineHeight = 15.4.sp,
                                fontWeight = FontWeight(500),
                                color = Color(67, 69, 69, 255)
                            ),
                            text = "Canva"
                        )

                        Text(
                            style = TextStyle(
                                fontFamily = poppinsFontFamily,
                                fontSize = 12.sp,
                                lineHeight = 13.2.sp,
                                fontWeight = FontWeight(400),
                                color = Color(67, 69, 69, 255)
                            ),
                            text = "Posted on 3 March "
                        )
                    }
                }
            }
        }

    @Composable
    fun SecondSection(){
        Box(
            modifier = Modifier
                .width(411.dp)
                .height(153.dp)
                .background(color = Color(255, 255, 255, 255))
                .padding(start = 24.dp, top = 24.dp)
        ){
            Column(
                modifier = Modifier
                    .height(105.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ){
                Row(
                    modifier = Modifier
                        .width(231.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column(){
                            Text(
                                style = TextStyle(
                                    fontFamily = poppinsFontFamily,
                                    fontSize = 12.sp,
                                    lineHeight = 12.sp,
                                    fontWeight = FontWeight(500),
                                    color = Color(67, 69, 69, 255)
                                ),
                                text = "APPLY BEFORE"
                            )

                            Text(
                                style = TextStyle(
                                    fontFamily = poppinsFontFamily,
                                    fontSize = 12.sp,
                                    lineHeight = 12.sp,
                                    fontWeight = FontWeight(400),
                                    color = Color(0, 0, 0, 255)
                                ),
                                text = "03 June, 2022"
                            )
                        }
                        Column(){
                            Text(
                                style = TextStyle(
                                    fontFamily = poppinsFontFamily,
                                    fontSize = 12.sp,
                                    lineHeight = 12.sp,
                                    fontWeight = FontWeight(500),
                                    color = Color(67, 69, 69, 255)
                                ),
                                text = "JOB NATURE"
                            )

                            Box(
                                modifier = Modifier
                                    .width(70.dp)
                                    .height(20.dp)
                                    .background(color = Color(191, 219, 209, 255), RoundedCornerShape(30.dp)),
                                contentAlignment = Alignment.Center
                            ){
                                Text(
                                    style = TextStyle(
                                        fontFamily = poppinsFontFamily,
                                        fontSize = 12.sp,
                                        lineHeight = 12.sp,
                                        fontWeight = FontWeight(400),
                                        color = Color(0, 0, 0, 255)
                                    ),
                                    text = "Full-time"
                                )
                            }
                        }
                    }
                Row(
                    modifier = Modifier
                        .width(284.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column(){
                        Text(
                            style = TextStyle(
                                fontFamily = poppinsFontFamily,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                fontWeight = FontWeight(500),
                                color = Color(67, 69, 69, 255)
                            ),
                            text = "SALARY RANGE"
                        )

                        Text(
                            style = TextStyle(
                                fontFamily = poppinsFontFamily,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0, 0, 0, 255)
                            ),
                            text = "40k - 60k/yearly"
                        )
                    }
                    Column(){
                        Text(
                            style = TextStyle(
                                fontFamily = poppinsFontFamily,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                fontWeight = FontWeight(500),
                                color = Color(67, 69, 69, 255)
                            ),
                            text = "JOB LOCATION"
                        )

                        Text(
                            style = TextStyle(
                                fontFamily = poppinsFontFamily,
                                fontSize = 12.sp,
                                lineHeight = 12.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0, 0, 0, 255)
                            ),
                            text = "Work from anywhere"
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun ThirdSection(){
        Box(
            modifier = Modifier
                .width(411.dp)
                .height(238.dp)
                .background(color = Color(255, 255, 255, 255))
                .padding(24.dp)
        ){
            Column(){
                Text(
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp,
                        lineHeight = 15.6.sp,
                        letterSpacing = 0.25.sp,
                        fontWeight = FontWeight(600),
                        color = Color(67, 69, 69, 255)
                    ),
                    text = "JOB DESCRIPTION"
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 14.sp,
                        lineHeight = 20.3.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0, 0, 0, 255)
                    ),
                    text = "Can you bring creative human-centered ideas to life and make great things happen beyond what meets the eye?\n" +
                            "We believe in teamwork, fun, complex projects, diverse perspectives, and simple solutions. How about you? We're looking for a like-minded"
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        style = TextStyle(
                            fontFamily = poppinsFontFamily,
                            fontSize = 12.sp,
                            lineHeight = 15.6.sp,
                            letterSpacing = 0.25.sp,
                            fontWeight = FontWeight(600),
                            color = Color(15, 172, 16, 255)
                        ),
                        text = "See more"
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Image(
                        painter = painterResource(id = R.drawable.dropdown),
                        contentDescription = "",
                        modifier = Modifier
                            .width(8.5.dp)
                            .height(6.dp)
                    )
                }
            }
        }
    }

    @Composable
    fun FourthSection(){
        Box(
            modifier = Modifier
                .width(411.dp)
                .height(237.dp)
                .background(color = Color(255, 255, 255, 255))
                .padding(24.dp)
        ){
            Column(){
                Text(
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp,
                        lineHeight = 13.2.sp,
                        fontWeight = FontWeight(600),
                        color = Color(67, 69, 69, 255)
                    ),
                    text = "ROLES AND RESPONSIBILITIES"
                )
                Spacer(modifier = Modifier.height(16.dp))
                val items = listOf(
                    "Drive the design process with cross-functional partners and design leads.\n",
                    "Design new experiences and patterns in a complex ecosystem and across platforms.\n",
                    "Partner with UX Research and Content Strategists through the design process.\n",
                    "Work closely with Product and Engineering to ensure a high quality implementation."
                )
                BulletPointList(items = items)
            }
        }
    }

    @Composable
    fun BulletPointList(items: List<String>) {
        Column(
            verticalArrangement = Arrangement.spacedBy((-14).dp)
        ) {
            items.forEach { item ->
                Row {
                    Text(text = "•", modifier = Modifier.padding(end = 8.dp))
                    Text(text = item)
                }
            }
        }
    }
}



