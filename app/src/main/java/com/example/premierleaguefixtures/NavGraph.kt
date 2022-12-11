package com.example.premierleaguefixtures

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import java.security.AccessController

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavGraph(navController: NavHostController) {
    AnimatedNavHost(navController = navController, startDestination = NavHost.FirstFragment.route) {
        composable(route = NavHost.FirstFragment.route) {
            FirstFragment(navController, Color.Black)
        }
        composable(route = NavHost.SecondFragment.route) {
            SecondFragment(navController = navController)
        }
    }


}