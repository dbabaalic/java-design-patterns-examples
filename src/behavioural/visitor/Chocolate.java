package behavioural.visitor;

public class Chocolate implements Product {

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
