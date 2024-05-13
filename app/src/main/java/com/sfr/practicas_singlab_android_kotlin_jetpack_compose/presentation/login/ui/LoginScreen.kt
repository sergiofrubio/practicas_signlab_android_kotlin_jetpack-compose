import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sfr.practicas_singlab_android_kotlin_jetpack_compose.presentation.login.viewModel.LoginViewModel

@Composable
fun LoginScreen(
    onGoToHome: () -> Unit,
    onSignUpClick: () -> Unit,
    onForgotClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val logInViewModel: LoginViewModel = hiltViewModel()
    val loginState = logInViewModel.loginState.collectAsState().value
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = loginState.email?: "",
            onValueChange = {logInViewModel.onEmailChanged(it) },
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = { /* Handle next action */ }
            )
        )

        OutlinedTextField(
            value = loginState.password?: "",
            onValueChange = {  logInViewModel.onPasswordChanged(it) },
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    // Hide keyboard on password done action
                    // if needed
                }
            )
        )

        Button(
            enabled = loginState.isLoginButtonEnabled,
            onClick = { if (loginState.isLoginButtonEnabled){
                onGoToHome()
            } else {
                Toast.makeText(context, "Compruebe sus datos", Toast.LENGTH_SHORT).show() }},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text("Log In")
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            TextButton(onClick = { onSignUpClick() }) {
                Text("Register", fontSize = 16.sp)
            }

            TextButton(onClick = { onForgotClick() }) {
                Text("Forgot Password?", fontSize = 16.sp)
            }
        }
    }
}
