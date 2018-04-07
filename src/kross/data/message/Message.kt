package kross.data

import java.time.LocalDateTime
import java.util.*

data class Message(
    val id: UUID,
    val authorId: UUID,
    val created: LocalDateTime,
    val message: String
    )