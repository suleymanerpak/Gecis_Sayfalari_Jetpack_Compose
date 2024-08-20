package com.example.odev_4_jetpack_compose

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Sayfa_Y(navController : NavController){

    BackHandler {
        navController.navigate("anasayfa") {
            popUpTo("anasayfa") { inclusive = true }
            launchSingleTop = true
        }
    }


}