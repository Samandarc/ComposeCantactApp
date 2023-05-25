package uz.gita.composecantactapp.data.model

import uz.gita.composecantactapp.data.local.room.entity.ContactEntity

data class ContactData(
    val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val phone: String,
) {
    fun toEntity() = ContactEntity(
        id, firstName, lastName, phone
    )
}
