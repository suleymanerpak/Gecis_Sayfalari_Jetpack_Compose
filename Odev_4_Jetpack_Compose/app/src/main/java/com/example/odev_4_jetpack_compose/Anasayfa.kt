package com.example.odev_4_jetpack_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa(navController : NavController){
    Scaffold(topBar = { TopAppBar(title = { Text(text = "Anasayfa") })})
    {paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Button(onClick = {
                navController.navigate("sayfa_a"){
                popUpTo("anasayfa"){inclusive = true}
            }})
            { Text(text = "GİT > A") }

            Button(onClick ={
                navController.navigate("sayfa_x"){
                    popUpTo("anasayfa"){inclusive = true}
                }})
            { Text(text = "GİT > X") }
        }
    }
}