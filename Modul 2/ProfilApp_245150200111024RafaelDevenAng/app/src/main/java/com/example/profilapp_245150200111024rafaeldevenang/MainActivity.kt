package com.example.profilapp_245150200111024rafaeldevenang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilapp_245150200111024rafaeldevenang.ui.theme.ProfilApp_245150200111024RafaelDevenAngTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilApp_245150200111024RafaelDevenAngTheme {
                Column(

                    modifier = Modifier.padding(top=50.dp).fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profil),
                        contentDescription = "Foto Profil",
                        modifier = Modifier.size(120.dp).clip(CircleShape).align(Alignment.CenterHorizontally).background(
                            Color(0xff151d2a)
                        )
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text("Nama  : Rafael Deven Ang", fontSize = 20.sp, fontWeight = FontWeight.Bold ,  modifier= Modifier.align(Alignment.CenterHorizontally))
                    Text("NIM   : 245150200111024",fontSize = 20.sp, fontWeight = FontWeight.Bold , modifier= Modifier.align(Alignment.CenterHorizontally))
                    Text("Mahasiswa Teknik Informatika" , modifier= Modifier.align(Alignment.CenterHorizontally))
                    Spacer(modifier = Modifier.height(8.dp))
                    FollowButton(modifier= Modifier.align(Alignment.CenterHorizontally))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfilApp_245150200111024RafaelDevenAngTheme {
        Greeting("Android")
    }
}

@Composable
fun FollowButton(modifier: Modifier) {
    var isFollowed by remember { mutableStateOf(false) }
    Button(onClick = { isFollowed = !isFollowed } , modifier=modifier) {
        Text(if (isFollowed) "Unfollow" else "Follow")
    }
}