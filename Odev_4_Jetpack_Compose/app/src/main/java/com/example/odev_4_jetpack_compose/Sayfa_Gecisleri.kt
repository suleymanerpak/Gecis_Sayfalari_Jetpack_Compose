package com.example.odev_4_jetpack_compose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Sayfa_Gecisleri(){
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination ="anasayfa" )
    {
        composable("anasayfa"){ Anasayfa(navController = navController)}
        composable("sayfa_a"){ Sayfa_A(navController = navController)}
        composable("sayfa_b"){ Sayfa_B(navController = navController)}
        composable("sayfa_x"){ Sayfa_X(navController = navController)}
        composable("sayfa_y"){ Sayfa_Y(navController = navController)}
    }
}

