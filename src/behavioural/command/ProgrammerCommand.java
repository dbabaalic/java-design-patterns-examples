package behavioural.command;

public class ProgrammerCommand implements Command {

    @Override
    public void speak() {
        System.out.println("Programmer: It works on my machine.");
    }
}
