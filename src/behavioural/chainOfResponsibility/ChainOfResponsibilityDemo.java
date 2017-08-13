package behavioural.chainOfResponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        Dispenser chain = getChain();

        chain.dispense(33);

    }

    private static Dispenser getChain() {
        Dispenser dispenser20 = new Dispenser20();

        Dispenser dispenser5 = new Dispenser5();
        dispenser20.setNextChain(dispenser5);

        Dispenser dispenser1 = new Dispenser1();
        dispenser5.setNextChain(dispenser1);

        return dispenser20;
    }
}
