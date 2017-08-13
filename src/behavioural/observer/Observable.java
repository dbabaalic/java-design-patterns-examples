package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    protected List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    abstract void notifyHighestBidChange();
    abstract void notifyAcceptedBidChange();
    abstract int getHighestBid();
    abstract void setHighestBid(int highestBid);

}
