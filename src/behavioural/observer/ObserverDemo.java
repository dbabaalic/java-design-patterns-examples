package behavioural.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Observable auctioneer = new Auctioneer();
        Observer mark = new Bidder("Mark", auctioneer);
        Observer ben = new Bidder("Ben", auctioneer);

        auctioneer.addObserver(mark);
        auctioneer.addObserver(ben);

        mark.makeNewHighestBid(50);
        System.out.println("--------------------------------------");
        ben.makeNewHighestBid(100);
        System.out.println("--------------------------------------");
        auctioneer.notifyAcceptedBidChange();
    }
}
