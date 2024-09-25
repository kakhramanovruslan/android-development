package com.example.assignment_1

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class FourthPage {

    private val poppinsFontFamily = FontFamily(
        Font(R.font.poppins, FontWeight.Normal)
    )

    @SuppressLint("NotConstructor")
    @Preview
    @Composable
    fun FourthPage(){
        Column (
            modifier = Modifier.fillMaxSize(),
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 10.dp)
            ){
                Text(
                    text = "9:41",
                    fontSize = 15.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(600),
                    lineHeight = 22.5.sp,
                    letterSpacing = (-0.3).sp

                )

                Image(
                    painter = painterResource(R.drawable.network_icon),
                    contentDescription = null,

                    )
                Image(
                    painter = painterResource(R.drawable.wifi_icon),
                    contentDescription = null,
                    modifier = Modifier.padding(horizontal = 6.dp)
                )
                Image(
                    painter = painterResource(R.drawable.group),
                    contentDescription = null
                )

            }
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp)

            ){
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 150.dp, top = 20.dp),

                    ){
                    Text(
                        text = "Profile",
                        fontFamily = poppinsFontFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400),
                        lineHeight = 24.sp,
                        letterSpacing = 0.12.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.icon),
                        contentDescription = null,
                    )
                }

                Row (
                    modifier = Modifier.padding(vertical = 10.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.ellipse),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 25.dp, horizontal = 15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                text = "2156",
                                fontSize = 16.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight(600),
                                lineHeight = 24.sp,
                                letterSpacing = 0.12.sp

                            )
                            Text(
                                text = "Followers",
                                fontSize = 16.sp,
                                color = Color(0xFF4E4B66),
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight(400),
                                lineHeight = 24.sp,
                                letterSpacing = 0.12.sp,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                text = "567",
                                fontSize = 16.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight(600),
                                lineHeight = 24.sp,
                                letterSpacing = 0.12.sp
                            )
                            Text(
                                text = "Following",
                                fontSize = 16.sp,
                                fontFamily = poppinsFontFamily,
                                color = Color(0xFF4E4B66),
                                fontWeight = FontWeight(400),
                                lineHeight = 24.sp,
                                letterSpacing = 0.12.sp,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }
                        Column (
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "23",
                                fontSize = 16.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight(600),
                                lineHeight = 24.sp,
                                letterSpacing = 0.12.sp
                            )
                            Text(
                                text = "News",
                                fontSize = 16.sp,
                                fontFamily = poppinsFontFamily,
                                color = Color(0xFF4E4B66),
                                fontWeight = FontWeight(400),
                                lineHeight = 24.sp,
                                letterSpacing = 0.12.sp,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }
                    }

                }
                Column {
                    Text(
                        text = "Wilson Franci",
                        fontSize = 16.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(600),
                        lineHeight = 24.sp,
                        letterSpacing = 0.12.sp
                    )
                    Text(
                        text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        fontSize = 16.sp,
                        color = Color(0xFF4E4B66),
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(400),
                        lineHeight = 24.sp,
                        letterSpacing = 0.12.sp,
                        modifier = Modifier.padding(vertical = 5.dp)
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(170.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1877F2)),
                        shape = RoundedCornerShape(6.dp)

                    ) {
                        Text(
                            text = "Edit profile",
                            fontSize = 16.sp,
                            fontFamily = poppinsFontFamily,
                            color = Color.White,
                            fontWeight = FontWeight(600),
                            lineHeight = 24.sp,
                            letterSpacing = 0.12.sp
                        )

                    }

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(170.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1877F2)),
                        shape = RoundedCornerShape(6.dp)

                    ) {
                        Text(
                            text = "Edit profile",
                            fontSize = 16.sp,
                            fontFamily = poppinsFontFamily,
                            color = Color.White,
                            fontWeight = FontWeight(600),
                            lineHeight = 24.sp,
                            letterSpacing = 0.12.sp
                        )

                    }
                }

                ContentPart(R.drawable.profile_image_1, "NFTs", "Minting Your First NFT: A Beginner’s Guide to Creating...", "15m ago")
                ContentPart(R.drawable.profile_image_2, "Business", "5 things to know before the stock market opens Monday", "1h ago")
                ContentPart(R.drawable.profile_image_3, "Travel", "Bali plans to reopen to international tourists in Septe...", "1w ago")
                ContentPart(R.drawable.profile_image_4, "Health", "Healthy Living: Diet and Exercise Tips & Tools for Success.", "4h ago")


            }
        }
    }

    @Composable
    fun ContentPart(iconId: Int, text: String, text2: String, text3: String){

        Row (
            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)

        ) {
            Image(
                painter = painterResource(id = iconId),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 5.dp).size(90.dp)
                    .clip(RoundedCornerShape(10.dp)),
            )
            Column(
                modifier = Modifier.padding(horizontal = 10.dp)
            ) {
                Text(
                    text = text,
                    fontSize = 13.sp,
                    color = Color(0xFF4E4B66),
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(400),
                    lineHeight = 19.5.sp,
                    letterSpacing = 0.12.sp,
                    modifier = Modifier.padding(vertical = 5.dp)
                )
                Text(
                    text = text2,
                    fontSize = 16.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(400),
                    lineHeight = 24.sp,
                    letterSpacing = 0.12.sp,
                    color = Color.Black
                )
                Row (
                    modifier = Modifier.padding(vertical = 4.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.ellipse),
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Text(
                        text = "Wilson Franci",
                        fontSize = 13.sp,
                        color = Color(0xFF4E4B66),
                        fontWeight = FontWeight(600),
                        lineHeight = 19.5.sp,
                        letterSpacing = 0.12.sp,
                        fontFamily = poppinsFontFamily,
                        modifier = Modifier.padding(5.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.clock_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(6.dp)
                            .size(15.dp)
                    )
                    Text(
                        text = text3,
                        fontSize = 13.sp,
                        color = Color(0xFF4E4B66),
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(400),
                        lineHeight = 19.5.sp,
                        letterSpacing = 0.12.sp,
                        modifier = Modifier.padding(vertical = 6.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        painter = painterResource(id = R.drawable.three_points),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(vertical = 7.dp)
                            .size(15.dp)

                    )
                }
            }
        }
    }

}



