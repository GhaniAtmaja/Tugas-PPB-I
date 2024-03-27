package com.example.tugasppb2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.tugasppb2.ui.theme.TugasPPB2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasPPB2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Ola Como Estas Mi Amigo!!!", "Muhammad Ghani Taufiqurrahman Atmaja", 22, "Teknik Informatika", "5025201110", "PPB I")
                }
            }
        }
    }
}

@Composable
fun Greeting(intro: String, nama: String, umur:Int, jurusan:String, nrp:String, kelas:String ) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {


        Text(
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 30.sp,
            text = intro
        )
        Text(
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "My name is $nama,"
        )
        Text(
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "My age is $umur years"
        )
        Text(
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            text = "Student from ITS on $jurusan with NRP $nrp"
        )
        Text(
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "Im from class $kelas"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
     TugasPPB2Theme{
        Greeting("Hello, Android!!!", "Muhammad Ferdian Iqbal", 22, "Teknik Informatika", "5025201020", "PPB-I")

    }
}