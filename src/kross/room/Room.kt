package kross.room

import kross.message.Message
import kross.Platform
import kross.user.User
import java.util.*

data class Room(
    val id: UUID,
    val name: String,
    val platform: Platform,
    val userList: List<User>,
    val log: List<Message>
)