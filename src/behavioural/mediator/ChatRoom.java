package behavioural.mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoom implements ChatRoomMediator {

    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM-dd hh:mm:ss");

    @Override
    public void showMessage(User user, String message) {
        System.out.println(DATE_FORMAT.format(new Date()) + " [" + user.getName() + "] " + message);
    }
}
