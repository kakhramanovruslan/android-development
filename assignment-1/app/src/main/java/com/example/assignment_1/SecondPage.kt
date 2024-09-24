package com.example.assignment_1

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class SecondPage {

    private val poppinsFontFamily = FontFamily(
        Font(R.font.poppins, FontWeight.Normal)
    )

    @SuppressLint("NotConstructor")
    @Preview
    @Composable
    fun SecondPage(){
        Box (
            modifier = Modifier
                .fillMaxSize()
                .background(Color(43, 192, 138, (0.25 * 255).toInt())),
        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp, start = 16.dp, end = 15.dp)
            ){
                Row(
                    modifier = Modifier
                        .width(380.dp)
                        .padding(end = 3.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically

                ){
                    Image(
                        painter = painterResource(id = R.drawable.ellipse),
                        contentDescription = "imageOfAvatar",
                        modifier = Modifier
                            .size(45.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = "imageOfAvatar",
                        modifier = Modifier
                            .width(18.dp)
                            .height(20.dp)
                    )
                }


                Column(
                    modifier = Modifier
                        .padding(top = 35.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ){
                    HeadOfItem("DESIGNER")

                    ContentItem(
                        R.drawable.image_avatar,
                        "Junior UX Designer",
                        "Canva",
                        R.drawable.expires_status,
                        "\$40-60k/yearly",
                        93
                    )

                    ContentItem(
                        R.drawable.image_avatar,
                        "Junior Product Designer",
                        "Canva",
                        R.drawable.applied_status,
                        "\$40-60k/yearly",
                        69
                    )

                    ContentItem(
                        R.drawable.image_avatar,
                        "Middle motion Designer",
                        "Canva",
                        R.drawable.expires_status,
                        "\$40-60k/yearly",
                        93
                    )

                    HeadOfItem("ANDROID")

                    ContentItem(
                        R.drawable.image_avatar,
                        "Junior Android developer",
                        "Kotlin, Java",
                        R.drawable.expires_status,
                        "\$40-60k/yearly",
                        93
                    )

                    ContentItem(
                        R.drawable.image_avatar,
                        "Middle Android developer",
                        "Kotlin, Java",
                        R.drawable.applied_status,
                        "\$40-60k/yearly",
                        69
                    )

                    ContentItem(
                        R.drawable.image_avatar,
                        "Junior UX Designer",
                        "Canva",
                        R.drawable.expires_status,
                        "\$40-60k/yearly",
                        93
                    )
                }
            }
        }
    }

    @Composable
    fun HeadOfItem(textOfHead: String){
        Text(
            style = TextStyle(
                fontFamily = poppinsFontFamily,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                letterSpacing = 1.sp,
                fontWeight = FontWeight(600),
                color = Color(67, 69, 69, 255)
            ),
            text = textOfHead
        )
    }


    @Composable
    fun ContentItem(
                imageOfAvatar: Int,
                jobPosition: String,
                jobSkills: String,
                imageOfStatus: Int,
                paystackText: String,
                imageOfStatusWidth: Int
        ) {
        Box(
            Modifier
                .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                .width(380.dp)
                .height(103.dp)
        ){
           Box(
               Modifier
                   .padding(top = 17.dp, start = 12.dp, end = 0.dp, bottom = 16.dp)
           ){
               Column(
                   Modifier.height(103.dp),
                   verticalArrangement = Arrangement.SpaceBetween
               ){
                   Row(
                       Modifier.width(380.dp),
                       horizontalArrangement = Arrangement.SpaceBetween,
                   ){
                       Box(){
                           Row(){
                               Image(
                                   painter = painterResource(id = imageOfAvatar),
                                   contentDescription = "imageOfAvatar",
                                   modifier = Modifier
                                       .size(35.dp)
                               )
                               Column(){
                                   Text(
                                       style = TextStyle(
                                           fontFamily = poppinsFontFamily,
                                           fontSize = 14.sp,
                                           lineHeight = 18.2.sp,
                                           letterSpacing = 0.25.sp,
                                           fontWeight = FontWeight(600),
                                           color = Color(13, 13, 13, 255)
                                       ),
                                       text = jobPosition,
                                       modifier = Modifier
                                           .padding(start = 12.dp)
                                   )
                                   Text(
                                       style = TextStyle(
                                       fontFamily = poppinsFontFamily,
                                       fontSize = 12.sp,
                                       lineHeight = 15.6.sp,
                                       letterSpacing = 0.25.sp,
                                       fontWeight = FontWeight(500),
                                       color = Color(67, 69, 69, 255)
                                   ),
                                       text = jobSkills,
                                       modifier = Modifier
                                           .padding(start = 12.dp)
                                   )
                               }
                           }
                       }
                       Image(
                           painter = painterResource(id = imageOfStatus),
                           contentDescription = "imageOfStatus",
                           modifier = Modifier
                               .width(imageOfStatusWidth.dp)
                               .height(20.dp)
                       )
                   }
                   Row(
                       Modifier.width(380.dp),
                       verticalAlignment = Alignment.CenterVertically,
                       horizontalArrangement = Arrangement.SpaceBetween,
                   ){
                       Box(
                           modifier = Modifier
                               .background(Color(18, 170, 115, (0.18 * 255).toInt()), shape = RoundedCornerShape(30.dp)),
                           ){
                           Text(
                               text = "Paystack",
                               modifier = Modifier
                                   .padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp),
                               style = TextStyle(
                                   fontFamily = poppinsFontFamily,
                                   fontSize = 12.sp,
                                   lineHeight = 15.6.sp,
                                   letterSpacing = 0.25.sp,
                                   fontWeight = FontWeight(500),
                                   color = Color(83, 89, 95, 255)
                               ),
                           )
                       }
                       Text(
                           style = TextStyle(
                               fontFamily = poppinsFontFamily,
                               fontSize = 12.sp,
                               lineHeight = 15.6.sp,
                               letterSpacing = 0.25.sp,
                               fontWeight = FontWeight(500),
                               color = Color(67, 69, 69, 255)
                           ),
                           modifier = Modifier.padding(end = 16.dp),
                           text = paystackText
                       )
                   }
               }

           }
        }
    }
}