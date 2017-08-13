package behavioural.observer;

public class Bidder implements Observer {

    private String name;

    private Observable observable;

    public Bidder (String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void updateHighestBid() {
        System.out.println(name+ " is notified that new highest bid is "+ observable.getHighestBid() + ".");
    }

    @Override
    public void updateAcceptedBid() {
        System.out.println(name+ " is notified that accepted bid is "+ observable.getHighestBid() + ".");
    }

    @Override
    public void makeNewHighestBid(int highestBid) {
        System.out.println(name+ " makes new highest bid "+ highestBid + ".");
        observable.setHighestBid(highestBid);
    }


}
