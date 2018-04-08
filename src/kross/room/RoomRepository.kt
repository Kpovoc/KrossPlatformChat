package kross.data.room

import java.util.*

interface RoomRepository {
  /**
   * Adds a new Room to storage.
   * Returned `String` contains error information if failed.
   */
  fun create(room: Room) : String
  /**
   * Reads a `Room` from storage by its [id].
   * Returned `String` contains error information if failed.
   */
  fun read(id: UUID) : Room
  /**
   * Updates a `Room` in storage.
   * Returned `String` contains error information if failed.
   */
  fun update(room: Room) : String
  /**
   * Deletes a `Room` from storage by its [id].
   * Returned `String` contains error information if failed.
   */
  fun delete(id: UUID) : String
}