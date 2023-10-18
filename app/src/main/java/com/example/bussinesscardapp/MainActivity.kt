package com.example.bussinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscardapp.ui.theme.BussinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(10.dp)
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "android",
                modifier = modifier
                    .size(128.dp)
                    .background(color = Color.Black)
            )
            Text(text = stringResource(id = R.string.full_name),
                color = Color.Black,
                fontSize = 32.sp,
            )

            Text(text = stringResource(id = R.string.title),
                color = Color(0xFF007443),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column (
            horizontalAlignment = Alignment.Start,
            modifier = modifier.padding(start = 24.dp)
        ) {
            Row (
                modifier = modifier.padding(bottom = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = "phone_icon",
                    tint = Color(0xFF007443),
                    modifier = modifier.size(28.dp)
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = stringResource(id = R.string.phone_number),
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
            Row (
                modifier = modifier.padding(bottom = 18.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = "social_media_icon",
                    tint = Color(0xFF007443),
                    modifier = modifier.size(28.dp)
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = stringResource(id = R.string.social_media),
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
            Row (verticalAlignment = Alignment.CenterVertically){
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = "email_icon",
                    tint = Color(0xFF007443),
                    modifier = modifier.size(28.dp)
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = stringResource(id = R.string.email),
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinessCardAppTheme {
        Card()
    }
}