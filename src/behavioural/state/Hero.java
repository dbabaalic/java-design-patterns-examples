package behavioural.state;

public class Hero {

    private String name;
    private MovementState movementState;

    public Hero(String name) { this.name = name; }

    public void move(){
        System.out.println(name+" is " + movementState.getState());
    }

    public void setHeroMovement(MovementState movementState) {
        this.movementState = movementState;
    }
}
