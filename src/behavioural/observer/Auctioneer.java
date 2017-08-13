package behavioural.observer;

public class Auctioneer extends Observable {

    private int highestBid;

    @Override
    void notifyHighestBidChange() {
        for(Observer observer : observers){
            observer.updateHighestBid();
        }
    }
    @Override
    void notifyAcceptedBidChange() {
        for(Observer observer : observers){
            observer.updateAcceptedBid();
        }
    }

    @Override
    public int getHighestBid(){
        return highestBid;
    }

    @Override
    void setHighestBid(int highestBid) {
        this.highestBid = highestBid;
        notifyHighestBidChange();
    }


}
