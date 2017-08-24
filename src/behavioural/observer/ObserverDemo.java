package behavioural.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        JobPostings jobPostings = new JobPostings();
        Observer ben = new JobSeeker("Ben");
        Observer john = new JobSeeker("John");

        jobPostings.addObserver(ben);
        jobPostings.addObserver(john);

        jobPostings.addJobPost(new JobPost("Java Developer"));

    }
}
