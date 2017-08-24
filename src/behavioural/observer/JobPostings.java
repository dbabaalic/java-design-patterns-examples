package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class JobPostings implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notify(JobPost jobPost) {
        for (Observer observer: observers) {
            observer.onJobPosted(jobPost);
        }
    }

    public void addJobPost(JobPost jobPost) {
        notify(jobPost);
    }
}
