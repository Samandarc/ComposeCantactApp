package uz.gita.composecantactapp.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import uz.gita.composecantactapp.data.model.ContactData
import uz.gita.composecantactapp.ui.component.ContactItem
import uz.gita.composecantactapp.ui.screen.addcontact.AddContactScreen

class HomeScreen : AndroidScreen() {
    @Composable
    override fun Content() {
        val viewModel: HomeViewModel = getViewModel<HomeViewModelImpl>()
        HomeScreenContent(viewModel)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HomeScreenContent(viewModel: HomeViewModel) {
    val state = viewModel.contactsLiveData.observeAsState(listOf<ContactData>())
    val navigator = LocalNavigator.currentOrThrow
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = {
                Text("Contacts")
            })
        },
        floatingActionButton = {
            Image(
                modifier = Modifier.clickable {
                    navigator.push(AddContactScreen())
                },
                imageVector = Icons.Default.Add, contentDescription = ""
            )
        }
    ) { contentPadding ->
        // Screen content
        LazyColumn(
            modifier = Modifier
                .padding(contentPadding)
        ) {
            items(state.value) {
                ContactItem(name = it.firstName + " " + it.lastName, number = it.phone)
            }
        }
    }
}

