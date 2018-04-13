package kross.message.repository

import kross.message.Message
import java.util.*

interface MessageRepo {
  /**
   * Adds a new `Message` to repos.
   * Returned `String` contains error information if failed.
   */
  fun create(message: Message) : String
  /**
   * Reads a `Message` from repos by its [id].
   * Returned `String` contains error information if failed.
   */
  fun read(id: UUID) : Message
  /**
   * Updates a `Message` in repos.
   * Returned `String` contains error information if failed.
   */
  fun update(message: Message) : String
  /**
   * Deletes a `Message` from repos by its [id].
   * Returned `String` contains error information if failed.
   */
  fun delete(id: UUID) : String
}