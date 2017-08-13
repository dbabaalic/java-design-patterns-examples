package behavioural.chainOfResponsibility;

public class Dispenser5 implements Dispenser {

    private Dispenser nextChain;

    @Override
    public void dispense(int amount) {
        int numberOfBanknotes = amount / 5;
        int remainder = amount % 5;
        System.out.println("Dispensing " + numberOfBanknotes + " banknotes of 5 euros");
        if (remainder != 0) {
            nextChain.dispense(remainder);
        }
    }

    @Override
    public void setNextChain(Dispenser dispenser) {
        this.nextChain = dispenser;
    }

}
