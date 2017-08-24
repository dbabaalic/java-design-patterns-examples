package behavioural.mediator;

public class MediatorDemo {

    public static void main(String[] args) {

        ChatRoomMediator chatRoom = new ChatRoom();

        User john = new User("John", chatRoom);
        User ben = new User("Ben", chatRoom);
        User maria = new User("Maria", chatRoom);

        ben.send("Hi all");
        john.send("Hi Ben");
        maria.send("Hi Ben");
    }
}
