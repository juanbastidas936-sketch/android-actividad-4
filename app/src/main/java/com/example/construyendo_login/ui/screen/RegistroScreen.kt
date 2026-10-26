package com.example.construyendo_login.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Paleta de colores Índigo & Gris (Material Design 3)
private val IndigoPrimary = Color(0xFF4F46E5)
private val IndigoDark = Color(0xFF3730A3)
private val SlateTextPrimary = Color(0xFF0F172A)
private val SlateTextSecondary = Color(0xFF64748B)
private val SurfaceBackground = Color(0xFFF8FAFC)
private val BorderColor = Color(0xFFE2E8F0)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen() {
    Scaffold(
        containerColor = SurfaceBackground,
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    // 1. Botón de flecha hacia atrás arriba a la izquierda
                    IconButton(
                        onClick = { /* onBackClick vacío */ },
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
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            // 2. Título grande: "Crea tu cuenta"
            Text(
                text = "Crea tu cuenta",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = SlateTextPrimary,
                letterSpacing = (-0.5).sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            // 3. Subtítulo: "Empieza tu viaje con nosotros"
            Text(
                text = "Empieza tu viaje con nosotros",
                fontSize = 16.sp,
                color = SlateTextSecondary
            )

            Spacer(modifier = Modifier.height(32.dp))

            // 4. Campo: "Nombre completo" con icono de persona
            OutlinedTextField(
                value = "Juan Pérez",
                onValueChange = {},
                readOnly = true,
                label = { Text("Nombre completo") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Person,
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

            Spacer(modifier = Modifier.height(16.dp))

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

            Spacer(modifier = Modifier.height(16.dp))

            // 6. Campo: "Contraseña" con icono de candado y ojo
            OutlinedTextField(
                value = "••••••••",
                onValueChange = {},
                readOnly = true,
                label = { Text("Contraseña") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = null,
                        tint = SlateTextSecondary
                    )
                },
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.Visibility,
                            contentDescription = "Mostrar contraseña",
                            tint = SlateTextSecondary
                        )
                    }
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

            Spacer(modifier = Modifier.height(16.dp))

            // 7. Campo: "Confirmar contraseña" con icono de candado
            OutlinedTextField(
                value = "••••••••",
                onValueChange = {},
                readOnly = true,
                label = { Text("Confirmar contraseña") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
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

            Spacer(modifier = Modifier.height(16.dp))

            // 8. Checkbox: "Acepto los términos y condiciones"
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ) {
                Checkbox(
                    checked = true,
                    onCheckedChange = null,
                    colors = CheckboxDefaults.colors(
                        checkedColor = IndigoPrimary,
                        checkmarkColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Acepto los términos y condiciones",
                    fontSize = 14.sp,
                    color = SlateTextSecondary,
                    lineHeight = 20.sp
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 9. Botón principal: "Crear cuenta"
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
                Text(
                    text = "Crear cuenta",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(28.dp))

            // 10. Separador: "O regístrate con"
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                HorizontalDivider(
                    modifier = Modifier.weight(1f),
                    color = BorderColor,
                    thickness = 1.dp
                )
                Text(
                    text = "O regístrate con",
                    fontSize = 13.sp,
                    color = SlateTextSecondary,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                HorizontalDivider(
                    modifier = Modifier.weight(1f),
                    color = BorderColor,
                    thickness = 1.dp
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 11. Botón: "Continuar con Google" con icono
            OutlinedButton(
                onClick = { /* onClick vacío */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                border = ButtonDefaults.outlinedButtonBorder.copy(brush = androidx.compose.ui.graphics.SolidColor(BorderColor)),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = SlateTextPrimary
                )
            ) {
                // Ícono representativo 'G' de Google
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF1F5F9)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "G",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4285F4),
                        fontSize = 15.sp
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Continuar con Google",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = SlateTextPrimary
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // 12. Pie: "¿Ya tienes una cuenta? Inicia sesión"
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "¿Ya tienes una cuenta? ",
                    fontSize = 14.sp,
                    color = SlateTextSecondary
                )
                Text(
                    text = "Inicia sesión",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = IndigoPrimary,
                    modifier = Modifier.clickable { /* onClick vacío */ }
                )
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CreateAccountScreenPreview() {
    MaterialTheme {
        CreateAccountScreen()
    }
}

@Composable
fun RegistroScreen() {
    CreateAccountScreen()
}