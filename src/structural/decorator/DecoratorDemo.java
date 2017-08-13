package structural.decorator;

public class DecoratorDemo 
{
    public static void main( String[] args ) {
        Widget widget = new OpacityDecorator(new BorderDecorator (new  TextBox(12, 13)));
        widget.draw();
    }

}
