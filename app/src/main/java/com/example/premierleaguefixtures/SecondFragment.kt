package com.example.premierleaguefixtures

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun SecondFragment(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize().background(Color.Red),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { navController.navigate(NavHost.FirstFragment.route) }) {
            Text(text = "Second Fragment", color = Color.Blue)

        }
    }

}