package behavioural.chainOfResponsibility;

public class Dispenser1 implements Dispenser {

    private Dispenser nextChain;

    @Override
    public void dispense(int amount) {
        int numberOfBanknotes = amount / 1;
        System.out.println("Dispensing " + numberOfBanknotes + " banknotes of 1 euros");
    }

    @Override
    public void setNextChain(Dispenser dispenser) {
        this.nextChain = dispenser;
    }

}
