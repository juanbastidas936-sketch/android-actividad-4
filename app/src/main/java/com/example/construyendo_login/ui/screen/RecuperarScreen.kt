package com.example.construyendo_login.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Paleta de colores Índigo & Gris (Material Design 3) - Consistente con CreateAccountScreen
private val IndigoPrimary = Color(0xFF4F46E5)
private val IndigoLightBg = Color(0xFFEEF2FF)
private val SlateTextPrimary = Color(0xFF0F172A)
private val SlateTextSecondary = Color(0xFF64748B)
private val SurfaceBackground = Color(0xFFF8FAFC)
private val BorderColor = Color(0xFFE2E8F0)
private val InfoCardBackground = Color(0xFFF1F5F9)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordScreen() {
    Scaffold(
        containerColor = SurfaceBackground,
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    // 1. Botón de flecha hacia atrás arriba a la izquierda
                    IconButton(
                        onClick = { /* onClick vacío */ },
                        modifier = Modifier
                            .padding(start = 8.dp)
                            .clip(CircleShape)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver",
                            tint = SlateTextPrimary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = SurfaceBackground
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp)
                .padding(bottom = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // 2. Círculo centrado con fondo índigo claro y un icono de candado grande
            Box(
                modifier = Modifier
                    .size(96.dp)
                    .clip(CircleShape)
                    .background(IndigoLightBg),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = null,
                    tint = IndigoPrimary,
                    modifier = Modifier.size(48.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 3. Título centrado: "¿Olvidaste tu contraseña?"
            Text(
                text = "¿Olvidaste tu contraseña?",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = SlateTextPrimary,
                textAlign = TextAlign.Center,
                letterSpacing = (-0.5).sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            // 4. Párrafo centrado: "No te preocupes. Ingresa el correo asociado a tu cuenta..."
            Text(
                text = "No te preocupes. Ingresa el correo asociado a tu cuenta y te enviaremos un enlace para restablecerla.",
                fontSize = 15.sp,
                color = SlateTextSecondary,
                textAlign = TextAlign.Center,
                lineHeight = 22.sp,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Spacer(modifier = Modifier.height(36.dp))

            // 5. Campo: "Correo electrónico" con icono de sobre
            OutlinedTextField(
                value = "ejemplo@correo.com",
                onValueChange = {},
                readOnly = true,
                label = { Text("Correo electrónico") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Email,
                        contentDescription = null,
                        tint = SlateTextSecondary
                    )
                },
                shape = RoundedCornerShape(14.dp),
                modifier = Modifier.fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = IndigoPrimary,
                    unfocusedBorderColor = BorderColor,
                    focusedLabelColor = IndigoPrimary,
                    unfocusedLabelColor = SlateTextSecondary,
                    focusedTextColor = SlateTextPrimary,
                    unfocusedTextColor = SlateTextPrimary
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            // 6. Botón principal con icono de avión de papel: "Enviar enlace de recuperación"
            Button(
                onClick = { /* onClick vacío */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = IndigoPrimary,
                    contentColor = Color.White
                ),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.Send,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Enviar enlace de recuperación",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 7. Botón de texto: "Volver a iniciar sesión"
            TextButton(
                onClick = { /* onClick vacío */ },
                modifier = Modifier.height(48.dp)
            ) {
                Text(
                    text = "Volver a iniciar sesión",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = IndigoPrimary
                )
            }

            Spacer(modifier = Modifier.height(28.dp))

            // 8. Tarjeta al final con icono de información
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(
                    containerColor = InfoCardBackground
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = null,
                        tint = IndigoPrimary,
                        modifier = Modifier
                            .size(22.dp)
                            .padding(top = 1.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Revisa también tu carpeta de spam. El enlace caduca en 30 minutos.",
                        fontSize = 13.sp,
                        color = SlateTextSecondary,
                        lineHeight = 19.sp
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ForgotPasswordScreenPreview() {
    MaterialTheme {
        ForgotPasswordScreen()
    }
}

@Composable
fun RecuperarScreen(
) {
    CreateAccountScreen()
}