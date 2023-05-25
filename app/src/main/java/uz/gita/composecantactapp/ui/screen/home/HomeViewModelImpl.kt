package uz.gita.composecantactapp.ui.screen.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.composecantactapp.data.model.ContactData
import uz.gita.composecantactapp.crud.AppRepository
import javax.inject.Inject

@HiltViewModel
class HomeViewModelImpl @Inject constructor(
    private val repository: AppRepository
): ViewModel(), HomeViewModel {
    override val contactsLiveData: LiveData<List<ContactData>>
        get() = repository.retrieveAllContacts().asLiveData()
}