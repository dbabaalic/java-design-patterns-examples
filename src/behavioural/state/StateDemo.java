package behavioural.state;

import java.util.Timer;

public class StateDemo {

    public static void main(String[] args) {

        Hero hercules = new Hero("Hercules");

        HeroMovementTask movementTask = new HeroMovementTask(hercules);

        movementTask.setHeroMovement(new MovingState());

        Timer timer = new Timer();
        timer.schedule(movementTask,0, 5000);

        try {
            Thread.sleep(9000);
            rightButtonPress(movementTask);
            Thread.sleep(9000);
            downButtonPress(movementTask);
            Thread.sleep(9000);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void downButtonPress(HeroMovementTask movementTask) {
        System.out.println("Button down is pressed");
        movementTask.setHeroMovement(new CrawlingState());
    }

    private static void rightButtonPress(HeroMovementTask movementTask) {
        System.out.println("Button right is pressed");
        movementTask.setHeroMovement(new RunningState());
    }
}
