package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // 1. Gambar Background Full Layar (Kain Hijau Bintang Emas)
        Image(
            painter = painterResource(id = R.drawable.bg_login),
            contentDescription = "Background Login",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 2. Susunan Komponen Secara Vertikal di Tengah
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Judul Login (Warna Emas Bintang)
            Text(
                text = "Login",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                color = Color(0xFFF3C65F)
            )

            // Subjudul (Warna Krem Hijau Muda)
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 16.sp,
                color = Color(0xFFD8E8C8)
            )

            Spacer(modifier = Modifier.height(25.dp))

            // Gambar Logo Billie Eilish (Dibuat Bulat)
            Image(
                painter = painterResource(id = R.drawable.logo_billie),
                contentDescription = "Logo Billie Eilish",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Teks Label Nama (Warna Pink Pita)
            Text(
                text = "Nama",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF4A7B9)
            )

            // Teks Nama Mahasiswa (Warna Emas)
            Text(
                text = "Azizah Aulia R Hamid",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF3C65F)
            )

            // Teks NIM (Warna Krem Terang)
            Text(
                text = "20000140001",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFD8E8C8)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Gambar Lingkaran di Bagian Bawah (Foto Billie Eilish)
            Box(
                modifier = Modifier
                    .size(280.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFD8E8C8)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.foto_billie),
                    contentDescription = "Foto Billie Eilish",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}