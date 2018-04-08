package kross.message

import java.util.*

public class MessageRepositorySQLite : MessageRepository {
  val TABLE_NAME = "rooms"
  val COLUMN_ID = "id"
  val COLUMN_AUTHOR_ID = "author_id"
  val COLUMN_CREATED = "created"
  val COLUMN_TEXT = "text"

  override fun create(message: Message): String {
    TODO("not implemented")
  }

  override fun read(id: UUID): Message {
    TODO("not implemented")
  }

  override fun update(message: Message): String {
    TODO("not implemented")
  }

  override fun delete(id: UUID): String {
    TODO("not implemented")
  }

}