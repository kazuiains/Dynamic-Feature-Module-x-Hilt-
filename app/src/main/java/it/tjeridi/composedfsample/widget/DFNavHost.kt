package it.tjeridi.composedfsample.widget

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import it.tjeridi.composedfsample.data.Screens
import it.tjeridi.composedfsample.main.screen.FirstScreen
import it.tjeridi.composedfsample.main.screen.SecondScreen
import it.tjeridi.composedfsample.main.screen.ThirdScreen
import it.tjeridi.composedfsample.utilities.dfFirst
import it.tjeridi.composedfsample.utilities.dfSecond
import it.tjeridi.composedfsample.utilities.dfThird
import it.tjeridi.df_fourth.DFFourthScreen

@Composable
fun DFNavHost(
    navController: NavHostController,
    startDestination: String,
    paddingValues: PaddingValues
) {
    NavHost(navController, startDestination = startDestination) {
        composable(
            route = Screens.FirstScreen.route,
        ) {
            FirstScreen(navController=navController)
        }
        composable(
            route = Screens.SecondScreen.route,
        ) {
            SecondScreen(navController=navController)
        }
        composable(
            route = Screens.ThirdScreen.route,
        ) {
            ThirdScreen(navController=navController)
        }
        composable(
            route = Screens.DFFourth.route,
        ) {
            DFFourthScreen()
        }
        dfFirst(paddingValues)
        dfSecond(paddingValues)
        dfThird(paddingValues)
    }
}