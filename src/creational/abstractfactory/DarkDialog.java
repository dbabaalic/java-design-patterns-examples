package creational.abstractfactory;

public class DarkDialog implements Dialog {
    @Override
    public void draw() {
        System.out.println("Drawing dark dialog.");
    }
}
