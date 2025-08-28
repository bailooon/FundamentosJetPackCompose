package bailooon.com.github.fundamentosjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import bailooon.com.github.fundamentosjetpackcompose.ui.theme.FundamentosJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FundamentosJetPackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Inicial(Modifier.padding(innerPadding))
                }
            }
        }
    }

@Composable
fun Inicial(modifier: Modifier = Modifier) {
    TextoCustomizado("Primeira função composable", modifier)
}

@Composable
fun TextoCustomizado(texto: String, modifier: Modifier = Modifier) {
    Text(
        text = texto,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewFuncaoInicial() {
    FundamentosJetPackComposeTheme {
        Inicial()
        }
    }
}
