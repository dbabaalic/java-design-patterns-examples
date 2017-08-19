package behavioural.visitor;

public class ProductDisplayVisitor implements ProductVisitor {

    @Override
    public void visit(Milk milk) {
        System.out.println("Visiting milk");
    }

    @Override
    public void visit(Chocolate chocolate) {
        System.out.println("Visiting chocolate");
    }

    @Override
    public void visit(Pudding pudding) {
        System.out.println("Visiting pudding");
    }

    @Override
    public void visit(ProductOrder productOrder) {
        System.out.println("Visiting order");
    }
}
