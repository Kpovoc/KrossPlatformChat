package kross.user.service

class UserServiceTERM : UserService {
  override fun createNewUser(email: String, userName: String,
                             password: String, isClientHashed: Boolean) : String {
    println("Email: $email")
    println("User: $userName")
    println("Pass: $password")
    println("isClientHashed: $isClientHashed")
    return ""
  }
}