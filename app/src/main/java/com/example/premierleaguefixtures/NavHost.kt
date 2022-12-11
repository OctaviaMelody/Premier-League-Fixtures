package com.example.premierleaguefixtures

import java.security.AccessController

sealed class NavHost(val route: String){

    object FirstFragment : NavHost(route = "firstFragment")
    object SecondFragment : NavHost(route = "secondFragment")

}