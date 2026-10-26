package com.example.construyendo_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.construyendo_login.ui.screen.LoginScreen
import com.example.construyendo_login.ui.screen.RegistroScreen
import com.example.construyendo_login.ui.screen.RecuperarScreen
import com.example.construyendo_login.ui.theme.Construyendo_LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Construyendo_LoginTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //LoginScreen()
                    //RegistroScreen()
                    RecuperarScreen()
                }
            }
        }
    }
}

