package kross.room

import java.util.*

public class RoomRepositorySQLite : RoomRepository {
  val TABLE_NAME = "rooms"
  val COLUMN_ID = "id"
  val COLUMN_NAME = "name"
  val COLUMN_PLATFORM = "platform"
  val COLUMN_USER_LIST = "user_list"
  val COLUMN_CHAT_LOG = "chat_log"

  override fun create(room: Room): String {
    TODO("not implemented")
  }

  override fun read(id: UUID): Room {
    TODO("not implemented")
  }

  override fun update(room: Room): String {
    TODO("not implemented")
  }

  override fun delete(id: UUID): String {
    TODO("not implemented")
  }

}