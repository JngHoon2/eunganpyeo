package com.tuan.eunganpyeo.view.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tuan.eunganpyeo.view.MainView
import com.tuan.eunganpyeo.view.NotificationSettingView

@Composable
fun NavigationHost(navController: NavHostController){
    NavHost(navController = navController, startDestination = "MainView") {
        composable("MainView") {
            MainView(navController)
        }
        composable("NotificationSettingView",
            enterTransition = { slideIntoContainer(
                towards =  AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(500)
            )},
            exitTransition = { slideOutOfContainer(
                towards =  AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(500)
            )}
        ) {
            NotificationSettingView()
        }
    }
}