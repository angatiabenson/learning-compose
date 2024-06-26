package ke.co.banit.leaningcompose.learning

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
