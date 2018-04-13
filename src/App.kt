import kross.message.repository.MessageRepo
import kross.message.repository.MessageRepoMEM
import kross.message.service.MessageService
import kross.message.service.MessageServiceTERM
import kross.room.repository.RoomRepo
import kross.room.repository.RoomRepoMEM
import kross.room.service.RoomService
import kross.room.service.RoomServiceTERM
import kross.user.repository.UserRepo
import kross.user.repository.UserRepoMEM
import kross.user.service.UserService
import kross.user.service.UserServiceTERM

fun app() = Application.instance

interface Application {
  val userRepo: UserRepo
  val userServ: UserService
  val roomRepo: RoomRepo
  val roomServ: RoomService
  val messageRepo: MessageRepo
  val messageServ: MessageService

  companion object {
    lateinit var instance: Application
  }
}

object App : Application{
  override val userRepo = UserRepoMEM()
  override val userServ = UserServiceTERM()
  override val roomRepo = RoomRepoMEM()
  override val roomServ = RoomServiceTERM()
  override val messageRepo = MessageRepoMEM()
  override val messageServ = MessageServiceTERM()

  fun initialize() {
    Application.instance = this
  }
}