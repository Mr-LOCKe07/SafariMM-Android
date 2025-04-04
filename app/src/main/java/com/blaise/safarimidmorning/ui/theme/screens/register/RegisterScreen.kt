package com.blaise.safarimidmorning.ui.theme.screens.register

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
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
import com.blaise.safarimidmorning.navigation.ROUTE_LOGIN

@Composable
fun Register_Screen(navController: NavHostController) {
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by remember { mutableStateOf(TextFieldValue("")) }
    var phonenumber by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue(""))}

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)){

        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Register",
            fontSize = 35.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Cyan)

        Spacer(modifier = Modifier.height(40.dp))
        OutlinedTextField(value =firstname,
            onValueChange = {firstname=it},
            label = {Text(text = "Enter first name",
                color = Color.White)},
            leadingIcon = {Icon(
                Icons.Default.Person,
                contentDescription = "First Name")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = lastname,
            onValueChange = {lastname=it},
            label = {Text(text = "Enter last name",
                color = Color.White)},
            leadingIcon = {Icon(
                Icons.Default.Person,
                contentDescription = "Last Name")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = phonenumber,
            onValueChange = {phonenumber=it},
            label = {Text(text = "Enter phone number",
                color = Color.White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            leadingIcon = {Icon(Icons.Default.Call,
                contentDescription = "Phone Number")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = {Text(text = "Enter email",
                color = Color.White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            leadingIcon = {Icon(
                Icons.Default.Email,
                contentDescription = "Email")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = {Text(text = "Enter password",
                color = Color.White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            leadingIcon = {Icon(
                Icons.Default.Lock,
                contentDescription = "Password")},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent),
            border = BorderStroke(2.dp, Color.White)
        ) {
            Text(text = "Register",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Already have an account?",
            color = Color.Magenta,
            fontSize =20.sp,
            fontFamily = FontFamily.Serif)
        Text(text = "Click to Login",
            modifier = Modifier.clickable { navController.navigate(ROUTE_LOGIN) },
            color = Color.Red,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp)
    }
}

@Preview
@Composable
private fun RegisterPrev() {
    Register_Screen(rememberNavController())
}