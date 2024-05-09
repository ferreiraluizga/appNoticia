package com.example.appnoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appnoticias.ui.theme.AppNoticiasTheme

//author: ferreiraluizga

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNoticiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.White),
            Arrangement.Center
        ) {
            Text(
                text = "App Notícias",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Em parceria com MRV, Atlético-MG fará treino aberto com renda revertida a vítimas das chuvas no RS", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Em parceria com a MRV, o Atlético-MG decidiu, na noite desta quarta-feira (8), pela realização de um treino aberto à torcida na Arena MRV, em Belo Horizonte. A atividade no sábado (11), às 10h, será beneficente, com ingressos a partir de R\$ 10.")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Bruno Mars no Brasil: nova pré-venda acontece nesta quinta-feira (9)", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Acontece, nesta quinta-feira (9), uma nova pré-venda para as apresentação de Bruno Mars no Brasil. Dessa vez, os ingressos são referentes aos shows extras, que foram anunciados pela Live Nation na quarta (8).")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "MRV&Co tem lucro de R$ 54 milhões no 1º trimestre", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "A MRV&Co teve lucro líquido ajustado para o segmento de incorporação no primeiro trimestre deste ano, impulsionado pelo avanço da margem bruta, informou o grupo imobiliário nesta quarta-feira (8).")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Chuvas no RS: sobe para 107 o número de mortos em todo o estado", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "A Defesa Civil do Rio Grande do Sul informou, em balanço divulgado no início da noite desta quarta-feira (8), que chegou a 107 o número de pessoas mortas em decorrência das chuvas que castigam o estado desde o início da semana passada. Há ainda 374 feridos e 136 desaparecidos.")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "ONU estima que cerca de 79 mil pessoas deixaram Rafah desde segunda-feira", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "A principal agência de ajuda humanitária da ONU em Gaza (UNRWA) estima que cerca de 79 mil pessoas fugiram da cidade de Rafah, no sul, desde segunda-feira (6), à medida que se expande uma ofensiva israelense na cidade.")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Pelo menos sete países manifestaram intenção de ajudar o Rio Grande do Sul", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "O Itamaraty afirmou que pelo menos sete países já manifestaram disposição em ajudar o Brasil no apoio à população atingida pela tragédia no Rio Grande do Sul. A maior parte deles é da América do Sul, mas houve contato ainda do Oriente Médio e América do Norte.")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "PGR denuncia irmãos Brazão e Rivaldo Barbosa por assassinato de Marielle", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "A Procuradoria-Geral da República denunciou o deputado federal Chiquinho Brazão, o conselheiro do Tribunal de Contas do Estado do Rio de Janeiro Domingos Brazão e o delegado Rivaldo Barbosa pelo assassinato da vereadora Marielle Franco e do motorista Anderson Gomes.")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Conheça a história da Bola de Ouro perdida por Maradona que reapareceu e vai a leilão", fontWeight = FontWeight.Bold)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "A Bola de Ouro vencida por Diego Maradona (1960-2020) em 1986, na Copa do Mundo do México daquele ano, que desapareceu por décadas em circunstâncias polêmicas, reapareceu agora para ser leiloada no mês que vem — e promete valer milhões de dólares.")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    AppNoticiasTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}

