package structural.decorator;

class OpacityDecorator extends Decorator {

    public OpacityDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("adding OpacityDecorator");
    }
}
