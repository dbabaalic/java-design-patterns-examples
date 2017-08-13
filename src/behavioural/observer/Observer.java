package behavioural.observer;

public interface Observer {

    void updateHighestBid();
    void updateAcceptedBid();
    void makeNewHighestBid(int highestBid);

}
