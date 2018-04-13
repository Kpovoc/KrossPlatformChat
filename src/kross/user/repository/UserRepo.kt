package kross.user.repository

import kross.user.User
import java.util.*

interface UserRepo {
  /**
   * Adds a new User to repos.
   * Returned `String` contains error information if failed.
   */
  fun create(user: User) : String
  /**
   * Reads a `User` from repos by their [id].
   * Returned `String` contains error information if failed.
   */
  fun read(id: UUID) : User
  /**
   * Updates a `User` in repos.
   * Returned `String` contains error information if failed.
   */
  fun update(user: User) : String
  /**
   * Deletes a `User` from repos by their [id].
   * Returned `String` contains error information if failed.
   */
  fun delete(id: UUID) : String
}