package behavioural.state;

import java.util.TimerTask;

public class HeroMovementTask extends TimerTask {

    private Hero hero;

    public HeroMovementTask(Hero hero) { this.hero = hero; }

    public void setHeroMovement(MovementState movementState) {
        this.hero.setHeroMovement(movementState);
    }

    @Override
    public void run() {
        hero.move();
    }
}