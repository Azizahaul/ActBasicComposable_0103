package com.example.pertemuan3



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasPraktikum(modifier: Modifier = Modifier) {
    val gambar = painterResource(id = R.drawable.logo_billie)
    Column(modifier = modifier) {
        // Komposisi Box, Column, dan Row tetap sama, hanya warna dan font yang diubah
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color(0xFF2E3B23)),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row1_Komponen1", color = Color(0xFFF3C65F), fontWeight = FontWeight.Bold)
                    Text(text = "Col1_Row1_Komponen2", color = Color(0xFFF3C65F), fontWeight = FontWeight.Bold)
                    Text(text = "Col1_Row1_Komponen3", color = Color(0xFFF3C65F), fontWeight = FontWeight.Bold)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Col1_Row2_Komponen1", color = Color(0xFFD8E8C8))
                    Text(text = "Col1_Row2_Komponen2", color = Color(0xFFD8E8C8))
                    Text(text = "Col1_Row2_Komponen3", color = Color(0xFFD8E8C8))
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color(0xFFD8E8C8)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Music",
                fontSize = 50.sp,
                color = Color(0xFFF4A7B9),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                modifier = Modifier.align(
                    alignment = Alignment.Center
                )
            )
        }
    }
}