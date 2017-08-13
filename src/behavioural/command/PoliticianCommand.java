package behavioural.command;

public class PoliticianCommand implements Command{
    @Override
    public void speak() {
        System.out.println("Politician: It will be better next year.");
    }
}
