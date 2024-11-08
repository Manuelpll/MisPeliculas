package com.example.mispeliculas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mispeliculas.ui.theme.MisPeliculasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MisPeliculasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Peliculas(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Peliculas( modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =Modifier
            .width(360.dp)
            .height(800.dp),
    ) {
        Row {
            Text(
                text = "Mis Peliculas",
                modifier = Modifier
                    .border(width = 3.dp, color = Color(0xFF354699))
                    .width(305.dp)
                    .height(93.dp)
                    .background(color = Color(0xFFDFE4FF))
            ) }
        Row( modifier = Modifier
            .border(width = 0.dp, color = Color(0xFF000000))
            .width(360.dp)
            .height(193.dp)
            ) {
            Image( modifier =Modifier
                .width(95.dp)
                .height(88.dp),
                painter = painterResource(id = R.drawable.a18547da3814b5091a21e1c334191d7a),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,

            )
            Image( modifier =Modifier
                .padding(0.dp)
                .width(175.dp)
                .height(159.dp),
                painter = painterResource(id = R.drawable._e8fb662e6e729baf067484554307900),
                contentDescription = "image description",
                contentScale = ContentScale.None
            )
        }
        Row( modifier = Modifier
            .border(width = 0.dp, color = Color(0xFF000000))
            .width(360.dp)
            .height(193.dp)){

        }
        Row( modifier = Modifier.border(width = 0.dp, color = Color(0xFF000000))
            .width(360.dp)
            .height(193.dp)){

            }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MisPeliculasTheme {
        Peliculas()
    }
}