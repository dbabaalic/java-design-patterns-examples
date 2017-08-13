package behavioural.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        File myFile = new File();

        myFile.setFileSavingStrategy(new WordFileSavingStrategy());
        myFile.save();
        System.out.println("-----------------------------------");

        myFile.setFileSavingStrategy(new PdfFileSavingStrategy());
        myFile.save();
    }

}
