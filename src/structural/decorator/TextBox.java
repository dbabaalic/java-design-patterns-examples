package structural.decorator;

public class TextBox implements Widget {

    private int height;
    private int width;

    public TextBox(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing textbox with height: "+ height +" and width: "+width);
    }
}
