package ke.co.banit.leaningcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val constraints = ConstraintSet {
                val greenBox = createRefFor("greenbox")
                val redBox = createRefFor("redbox")
                val blueBox = createRefFor("bluebox")
                val title = createRefFor("title")

                constrain(title) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.wrapContent
                }
                constrain(greenBox) {
                    top.linkTo(title.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(redBox.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }
                constrain(redBox) {
                    top.linkTo(title.bottom)
                    start.linkTo(greenBox.end)
                    end.linkTo(blueBox.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }
                constrain(blueBox) {
                    top.linkTo(title.bottom)
                    start.linkTo(redBox.end)
                    end.linkTo(parent.end)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }
            }

            ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {
                Text(
                    text = "App Title",
                    style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .layoutId("title"),
                    textAlign = TextAlign.Center
                )
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .background(Color.Green)
                        .layoutId("greenbox"))
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .background(Color.Red)
                        .layoutId("redbox"))
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .background(Color.Blue)
                        .layoutId("bluebox"))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}