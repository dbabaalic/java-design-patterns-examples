package behavioural.observer;

public interface Observable {

    void addObserver(Observer observer);
    void notify(JobPost jobPost);
}
