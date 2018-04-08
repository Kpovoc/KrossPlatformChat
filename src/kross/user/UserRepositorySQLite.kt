package kross.user

import java.util.*

public class UserRepositorySQLite : UserRepository {
  val TABLE_NAME = "users"
  val COLUMN_ID = "id"
  val COLUMN_USERNAME = "username"
  val COLUMN_EMAIL = "email"
  val COLUMN_PW_HASH = "pw_hash"
  val COLUMN_PW_SALT = "pw_salt"

  override fun create(user: User): String {
    TODO("not implemented")
  }

  override fun read(id: UUID): User {
    TODO("not implemented")
  }

  override fun update(user: User): String {
    TODO("not implemented")
  }

  override fun delete(id: UUID): String {
    TODO("not implemented")
  }
}