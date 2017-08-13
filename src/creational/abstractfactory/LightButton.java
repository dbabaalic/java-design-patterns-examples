package creational.abstractfactory;

public class LightButton implements Button {

    @Override
    public void draw() {
        System.out.println("Drawing light button.");
    }
}
