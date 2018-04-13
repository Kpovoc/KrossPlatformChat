package kross.room.repository

import kross.room.Room
import java.util.*

interface RoomRepo {
  /**
   * Adds a new Room to repos.
   * Returned `String` contains error information if failed.
   */
  fun create(room: Room) : String
  /**
   * Reads a `Room` from repos by its [id].
   * Returned `String` contains error information if failed.
   */
  fun read(id: UUID) : Room
  /**
   * Updates a `Room` in repos.
   * Returned `String` contains error information if failed.
   */
  fun update(room: Room) : String
  /**
   * Deletes a `Room` from repos by its [id].
   * Returned `String` contains error information if failed.
   */
  fun delete(id: UUID) : String
}