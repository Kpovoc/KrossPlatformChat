package kross.message

import java.util.*

interface MessageRepository {
  /**
   * Adds a new `Message` to storage.
   * Returned `String` contains error information if failed.
   */
  fun create(message: Message) : String
  /**
   * Reads a `Message` from storage by its [id].
   * Returned `String` contains error information if failed.
   */
  fun read(id: UUID) : Message
  /**
   * Updates a `Message` in storage.
   * Returned `String` contains error information if failed.
   */
  fun update(message: Message) : String
  /**
   * Deletes a `Message` from storage by its [id].
   * Returned `String` contains error information if failed.
   */
  fun delete(id: UUID) : String
}