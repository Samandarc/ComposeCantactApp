package uz.gita.composecantactapp.crud

import kotlinx.coroutines.flow.Flow
import uz.gita.composecantactapp.data.model.ContactData

interface AppRepository {

    suspend fun add(contactData: ContactData)
    fun delete(contactData: ContactData)
    fun update(contactData: ContactData)
    fun retrieveAllContacts(): Flow<List<ContactData>>
}