package creational.abstractfactory;

public class LightDialog implements Dialog {

    @Override
    public void draw() {
        System.out.println("Drawing light dialog.");
    }
}
