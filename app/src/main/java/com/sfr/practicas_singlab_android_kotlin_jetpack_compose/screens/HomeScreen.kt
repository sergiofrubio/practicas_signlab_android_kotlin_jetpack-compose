package com.sfr.practicas_singlab_android_kotlin_jetpack_compose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun  HomeScreen(navController: NavController, modifier: Modifier = Modifier){
    Column(modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text= "Home Screen", fontSize = 40.sp)
        Spacer(modifier.height(40.dp))
        Button(onClick = {

            navController.navigate("A")
        }) {
            Text(text = "Go to A", fontSize = 25.sp)
        }
        Spacer(modifier.height(40.dp))
        Button(onClick = {
            navController.navigate("B")
        }) {
            Text(text = "Go to B", fontSize = 25.sp)
        }

    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen(navController = rememberNavController())
}