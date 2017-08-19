package behavioural.visitor;

public interface ProductVisitor {

    void visit(Milk milk);
    void visit(Chocolate chocolate);
    void visit(Pudding pudding);
    void visit(ProductOrder productOrder);
}
