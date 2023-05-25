package uz.gita.composecantactapp.data.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.gita.composecantactapp.data.model.ContactData

@Entity("contacts")
data class ContactEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val phone: String,
) {
    fun toData() = ContactData(
        id, firstName, lastName, phone
    )
}
