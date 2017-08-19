package behavioural.visitor;

public class Pudding implements Product {

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
