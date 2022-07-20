package com.example.mybottonnavigationcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mybottonnavigationcompose.screens.HomeScreen
import com.example.mybottonnavigationcompose.screens.ProfileScreen
import com.example.mybottonnavigationcompose.screens.SettingsScreen

/**
 * Created by Nicola Luigi Piriottu on 20/07/22.
 */

@Composable
fun BottomNavGraph(navHostController: NavHostController) {

    NavHost(
        navController = navHostController,
        startDestination = BottomBarScreen.HomeScreen.route
    ) {

        composable(route = BottomBarScreen.HomeScreen.route){
            HomeScreen()
        }

        composable(route = BottomBarScreen.ProfileScreen.route){
            ProfileScreen()
        }

        composable(route = BottomBarScreen.SettingsScreen.route){
            SettingsScreen()
        }
    }
}