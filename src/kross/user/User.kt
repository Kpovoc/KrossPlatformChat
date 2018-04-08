package kross.user

import java.util.*

data class User(
    val id: UUID,
    val userName: String,
    val email: String,
    val password: String // TODO: Remove from actual user obj
)