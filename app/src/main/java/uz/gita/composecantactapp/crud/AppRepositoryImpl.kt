package uz.gita.composecantactapp.crud

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import uz.gita.composecantactapp.data.local.room.dao.ContactDao
import uz.gita.composecantactapp.data.model.ContactData
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(
    val dao: ContactDao
): AppRepository {

    override suspend fun add(contactData: ContactData) {
        withContext(Dispatchers.IO) {
            dao.add(contactData.toEntity())
        }
    }

    override fun delete(contactData: ContactData) {
        dao.delete(contactData.toEntity())
    }

    override fun update(contactData: ContactData) {
        dao.update(contactData.toEntity())
    }

    override fun retrieveAllContacts(): Flow<List<ContactData>> =
        dao.retrieveAllContacts().map {
            it.map {
                it.toData()
            }
        }

}