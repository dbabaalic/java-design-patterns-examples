package behavioural.chainOfResponsibility;

public class Dispenser20 implements Dispenser {

    private Dispenser nextChain;

    @Override
    public void dispense(int amount) {
        int numberOfBanknotes = amount / 20;
        int remainder = amount % 20;
        System.out.println("Dispensing " + numberOfBanknotes + " banknotes of 20 euros");
        if (remainder != 0) {
            nextChain.dispense(remainder);
        }
    }

    @Override
    public void setNextChain(Dispenser dispenser) {
        this.nextChain = dispenser;
    }

}
