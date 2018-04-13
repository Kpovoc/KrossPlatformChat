package kross.user.service

/**
 * Verifies User can perform the requested service,
 * calls the appropriate controller for the action,
 * and returns the appropriate response to the UI
 */
interface UserService {
  fun createNewUser( email: String, userName: String, password: String, isClientHashed: Boolean) : String
}