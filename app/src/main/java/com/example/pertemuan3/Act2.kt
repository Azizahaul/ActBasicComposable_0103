package com.example.pertemuan3

@Composable
fun contohColumn(modifier: Modifier){
    Column(
        modifier = Modifier
            .padding(top = 20.dp, start= 20.dp)

    ){
        Text("Hello")
        Text("World")
    }
}
