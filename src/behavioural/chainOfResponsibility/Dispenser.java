package behavioural.chainOfResponsibility;

public interface Dispenser {

    public void dispense(int amount);

    public void setNextChain(Dispenser dispenser);

}
