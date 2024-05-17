package ke.co.banit.leaningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ke.co.banit.leaningcompose.ui.theme.LeaningComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeaningComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun MainLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(3.dp, color = Color.Black)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Greeting("Android")
            Spacer(modifier = Modifier.height(10.dp))
            Greeting("Angatia Benson")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(3.dp, color = Color.Black)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier
                    .border(3.dp, color = Color.Black)
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Greeting("Android")
                Spacer(modifier = Modifier.height(10.dp))
                Greeting("Angatia Benson")
            }
            Column(
                modifier = Modifier
                    .border(3.dp, color = Color.Black)
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Greeting("Android")
                Spacer(modifier = Modifier.height(10.dp))
                Greeting("Angatia Benson")
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter, contentDescription: String, title: String, modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            ) {

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
            ) {
                Text(
                    text = title,
                    style = TextStyle(color = Color.White, fontSize = 16.sp),
                    modifier = Modifier.align(Alignment.BottomStart)
                )
            }
        }
    }
}

@Composable
fun ImageCardLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        val painter = painterResource(id = R.drawable.snowman)
        val contentDescription = "Snowman in the snow"
        val title = "Snowman is happily playing in the snow"
        ImageCard(
            painter = painter,
            contentDescription = contentDescription,
            title = title,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun TextStylingLayout() {
    val fontFamily = FontFamily(
        Font(R.font.light_more, FontWeight.Thin),
        Font(R.font.light, FontWeight.Light),
        Font(R.font.normal, FontWeight.Normal),
        Font(R.font.bold, FontWeight.Bold),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF101010))
            .padding(12.dp)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ){
                    append("J")
                }
                append("etpack ")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ){
                    append("C")
                }
                append("ompose")
            },
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextStylingLayout()
}