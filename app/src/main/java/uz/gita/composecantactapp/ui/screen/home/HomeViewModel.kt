package uz.gita.composecantactapp.ui.screen.home

import androidx.lifecycle.LiveData
import uz.gita.composecantactapp.data.model.ContactData

interface HomeViewModel {
    val contactsLiveData: LiveData<List<ContactData>>
}