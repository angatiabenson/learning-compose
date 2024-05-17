package ke.co.banit.leaningcompose.learning

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun MyComposable() {
    val color = remember {
        mutableStateOf(Color.Yellow)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ColorBox(
            Modifier
                .width(200.dp)
                .height(200.dp)
        ){
            color.value = it
        }
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(color.value)
        ){

        }
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier, updateColor: (Color)->Unit) {

    Box(modifier = modifier
        .background(Color.Yellow)
        .fillMaxSize()
        .clickable {
            updateColor(Color(
                Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f
            ))
        })
}