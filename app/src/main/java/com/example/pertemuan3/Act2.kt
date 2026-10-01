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
@Composable

fun contohRow(modifier: Modifier){

    val kota= stringResource( id= R.string.kota)

    Row(

        modifier = Modifier

            .padding(top=60.dp, start = 60.dp)

            .fillMaxWidth()

    ){

        Text(text = "Hello")

        Text(text = kota)

    }

}

