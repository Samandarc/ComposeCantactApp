package uz.gita.composecantactapp.ui.screen.addcontact

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import uz.gita.composecantactapp.ui.component.MyTextField
import uz.gita.composecantactapp.ui.screen.addcontact.viewmodel.AddContactViewModel
import uz.gita.composecantactapp.ui.screen.addcontact.viewmodel.AddContactViewModelImpl
import uz.gita.composecantactapp.ui.theme.ContactAppComposeTheme

class AddContactScreen : AndroidScreen() {
    @Composable
    override fun Content() {
        val viewModel: AddContactViewModel = getViewModel<AddContactViewModelImpl>()
        AddContactScreenContent(viewModel)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddContactScreenContent(
    viewModel: AddContactViewModel
) {
    var fname by remember {
        mutableStateOf("")
    }

    var lname by remember {
        mutableStateOf("")
    }

    var phone by remember {
        mutableStateOf("")
    }

    val navigator = LocalNavigator.currentOrThrow

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("My App")
                },
                navigationIcon = {
                    Image(
                        modifier = Modifier.clickable { navigator.pop() },
                        imageVector = Icons.Default.Close, contentDescription = null)
                }
            )
        },

        ) { contentPadding ->
        // Screen content
        Column(modifier = Modifier.padding(contentPadding), verticalArrangement = Arrangement.spacedBy(8.dp), horizontalAlignment = Alignment.Start) {
            Text(modifier = Modifier.padding(start = 8.dp, top = 4.dp), text = "First name")
            MyTextField(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp), value = fname, onValueChange = { fname = it })
            Text(modifier = Modifier.padding(start = 8.dp, top = 4.dp), text = "Last name")
            MyTextField(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp), value = lname, onValueChange = { lname = it })
            Text(modifier = Modifier.padding(start = 8.dp, top = 4.dp), text = "Phone name")
            MyTextField(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp), value = phone, onValueChange = { phone = it })

            ElevatedButton(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 8.dp), onClick = {
                viewModel.addContact(fname, lname, phone)
            }) {
                Text(
                    text = "Add Contact",
                    modifier = Modifier,

                )
            }

        }
    }
}


@Preview
@Composable
fun AddContactScreenPreview() {
    ContactAppComposeTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

        }
    }
}