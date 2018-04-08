package kross.data.user

import java.util.*

interface UserRepository {
  /**
   * Adds a new User to storage.
   * Returned `String` contains error information if failed.
   */
  fun create(user: User) : String
  /**
   * Reads a `User` from storage by their [id].
   * Returned `String` contains error information if failed.
   */
  fun read(id: UUID) : User
  /**
   * Updates a `User` in storage.
   * Returned `String` contains error information if failed.
   */
  fun update(user: User) : String
  /**
   * Deletes a `User` from storage by their [id].
   * Returned `String` contains error information if failed.
   */
  fun delete(id: UUID) : String
}