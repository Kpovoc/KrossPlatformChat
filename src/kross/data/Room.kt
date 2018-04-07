package kross.data

import java.util.*

data class Room(
    val id: UUID,
    val name: String,
    val platform: Platform,
    val userList: List<User>,
    val log: List<Message>
)