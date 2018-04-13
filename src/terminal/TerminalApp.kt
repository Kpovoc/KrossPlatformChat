package terminal

import app

object TerminalApp {
  private val userServ = app().userServ

  fun start() {
    userServ.createNewUser("user@email.com", "diggle", "12345", false)
  }
}