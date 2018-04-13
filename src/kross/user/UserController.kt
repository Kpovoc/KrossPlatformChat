package kross.user

import java.security.SecureRandom
import java.util.*
import org.mindrot.jbcrypt.BCrypt

class UserController {
  val random = SecureRandom()
  fun generateNewUser(email: String, userName: String,
                      password: String, isClientHashed: Boolean) : User {
    var pWord = password

    if (!isClientHashed)
      pWord = clientHash(userName, password)

    val bytes: ByteArray = ByteArray(32)
    random.nextBytes(bytes)
    val salt = String(bytes)
    val pwHash = BCrypt.hashpw(pWord, salt)

    return User(UUID.randomUUID(), userName, email, pwHash, salt)
  }

  fun clientHash(username: String, password: String) : String {
    return BCrypt.hashpw(password, username)
  }
}