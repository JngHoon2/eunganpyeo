package com.tuan.eunganpyeo.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tuan.eunganpyeo.view.navigation.BottomNavigation
import com.tuan.eunganpyeo.view.navigation.NavigationGraph
import com.tuan.eunganpyeo.view.theme.NoRippleTheme

@Composable
fun MainView(naviController: NavHostController){

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            CompositionLocalProvider(LocalRippleTheme provides NoRippleTheme) {
                BottomNavigation(
                    modifier = Modifier,
                    containerColor = Color.White,
                    contentColor = Color.Red,
                    navController = navController
                )
            }
        }
    ) {
        Box(Modifier.padding(it)){
            NavigationGraph(navController = navController, naviController = naviController)
        }
    }
}