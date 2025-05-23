package com.blaise.safarimidmorning.ui.theme.screens.login

import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.blaise.safarimidmorning.navigation.ROUTE_REGISTER
import org.w3c.dom.Text

@Composable
fun Login_Screen(navController: NavHostController) {
    var email by remember { mutableStateOf (TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)) {
        Text(text = "Login",
            color = Color.Red,
            fontSize = 35.sp,
            fontFamily = FontFamily.Serif
        )
        // Email Field
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedTextField(value =email,
            onValueChange = {email=it},
            label = { Text(text = "Enter Email",
            color = Color.White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            leadingIcon = {
                Icon(Icons.Default.Email,
                contentDescription = "Email")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )
        // Password Field
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value =password,
            onValueChange = {password=it},
            label = { Text(text = "Enter Password",
            color = Color.White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            leadingIcon = {
                Icon(Icons.Default.Lock,
                contentDescription = "Password")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
            )

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent),
            border = BorderStroke(2.dp, Color.White)
        ) {
            Text(text = "Login",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Don't have an account?",
            color = Color.Magenta,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif)
        Text(text = "Click to Register",
            modifier = Modifier.clickable { navController.navigate(ROUTE_REGISTER) },
            color = Color.Cyan,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp)
    }


}

@Preview
@Composable
private fun LoginPrev() {
    Login_Screen(rememberNavController())
}