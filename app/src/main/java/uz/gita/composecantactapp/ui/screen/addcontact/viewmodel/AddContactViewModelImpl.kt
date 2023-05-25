package uz.gita.composecantactapp.ui.screen.addcontact.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.gita.composecantactapp.data.model.ContactData
import uz.gita.composecantactapp.crud.AppRepository
import javax.inject.Inject


@HiltViewModel
class AddContactViewModelImpl @Inject constructor(
    private val repository: AppRepository
): ViewModel(), AddContactViewModel {

    override fun addContact(fname: String, lname: String, phone: String) {
        viewModelScope.launch {
            repository.add(ContactData(firstName = fname, lastName = lname, phone = phone))
        }
    }
}