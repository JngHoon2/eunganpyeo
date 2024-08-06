package com.tuan.eunganpyeo.view.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val title: String, val icon: ImageVector, val screenRoute: String
) {
    object CountScreen : BottomNavItem("추적", Icons.Filled.Home, "CountView")
    object InformationScreen : BottomNavItem("정보", Icons.Filled.Info, "InformationView")
    object SettingScreen : BottomNavItem("설정", Icons.Filled.Settings, "SettingView")
}