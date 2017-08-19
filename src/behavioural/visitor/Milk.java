package behavioural.visitor;

public class Milk implements Product {

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
