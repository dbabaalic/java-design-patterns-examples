package behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {
        List<Command> commands = produceCommands();
        runCommands(commands);
    }

    private static void runCommands(List<Command> commands) {
        for(Command command : commands){
            command.speak();
        }
    }


    private static List<Command> produceCommands() {
        List<Command> queue = new ArrayList<>();
        queue.add(new PoliticianCommand());
        queue.add(new ProgrammerCommand());
        queue.add(new DeliveryManagerCommand());
        return queue;
    }
}
