package behavioural.strategy;

public class WordFileSavingStrategy implements FileSavingStrategy {

    @Override
    public void save() {
        System.out.println("Saving file as word document.");
    }
}
