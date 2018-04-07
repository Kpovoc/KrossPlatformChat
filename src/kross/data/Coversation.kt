package kross.data

import java.util.*

data class Conversation(
    val id: UUID,
    val userA: UUID,
    val userB: UUID,
    val log: List<Message>
)