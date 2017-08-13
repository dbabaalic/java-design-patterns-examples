package behavioural.strategy;

public class PdfFileSavingStrategy implements FileSavingStrategy {

    @Override
    public void save() {
        System.out.println("Saving file as pdf document.");
    }
}
