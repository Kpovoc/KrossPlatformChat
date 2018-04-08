package kross.data.room

import kross.data.message.Message
import kross.data.Platform
import kross.data.user.User
import java.util.*

data class Room(
    val id: UUID,
    val name: String,
    val platform: Platform,
    val userList: List<User>,
    val log: List<Message>
)