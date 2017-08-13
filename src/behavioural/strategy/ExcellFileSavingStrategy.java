package behavioural.strategy;

public class ExcellFileSavingStrategy implements FileSavingStrategy {

    @Override
    public void save() {
        System.out.println("Saving file as excell document.");
    }
}
