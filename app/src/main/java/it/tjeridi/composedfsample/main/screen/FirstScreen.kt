package it.tjeridi.composedfsample.main.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import it.tjeridi.composedfsample.data.Screens

@Suppress("unused")
@Composable
fun FirstScreen(
    navController: NavHostController,
    viewModel: FirstViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Ini aplikasi versi ${viewModel.version}",
            modifier = Modifier.padding(all = 20.dp)
        )
        Button(
            onClick = {
                navController.navigate(Screens.DFFirst.route)
            }
        ) {
            Text("Ke Module 1")
        }
        Button(
            onClick = {
                navController.navigate(Screens.DFSecond.route)
            }
        ) {
            Text("Ke Module 2")
        }
        Button(
            onClick = {
                navController.navigate(Screens.DFThird.route)
            }
        ) {
            Text("Ke Module 3")
        }
        Button(
            onClick = {
                navController.navigate(Screens.DFFourth.route)
            }
        ) {
            Text("Ke Module 4")
        }
    }
}