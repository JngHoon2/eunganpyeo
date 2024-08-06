package com.tuan.eunganpyeo.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tuan.eunganpyeo.view.CountView
import com.tuan.eunganpyeo.view.InformationView
import com.tuan.eunganpyeo.view.SettingView

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavItem.CountScreen.screenRoute) {
        composable(BottomNavItem.CountScreen.screenRoute) {
            CountView()
        }
        composable(BottomNavItem.InformationScreen.screenRoute) {
            InformationView()
        }
        composable(BottomNavItem.SettingScreen.screenRoute) {
            SettingView()
        }
    }
}