package kross.message.repository

import kross.message.Message
import java.util.*

class MessageRepoMEM : MessageRepo {
  override fun create(message: Message): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun read(id: UUID): Message {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun update(message: Message): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun delete(id: UUID): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}