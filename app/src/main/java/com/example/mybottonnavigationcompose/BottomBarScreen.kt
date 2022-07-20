package com.example.mybottonnavigationcompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Nicola Luigi Piriottu on 20/07/22.
 */
sealed class BottomBarScreen(val route: String, val title: String, val icon: ImageVector) {

    object HomeScreen :
        BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object ProfileScreen :
        BottomBarScreen(
            route = "profile",
            title = "Profile",
            icon = Icons.Default.Person
        )

    object SettingsScreen :
        BottomBarScreen(
            route = "settings",
            title = "Settings",
            icon = Icons.Default.Settings
        )
}
