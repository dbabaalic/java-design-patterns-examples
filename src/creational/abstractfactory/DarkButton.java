package creational.abstractfactory;

public class DarkButton implements  Button{

    @Override
    public void draw() {
        System.out.println("Drawing dark button.");
    }
}
