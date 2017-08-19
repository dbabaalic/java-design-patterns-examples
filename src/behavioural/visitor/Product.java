package behavioural.visitor;

public interface Product {

    void accept(ProductVisitor visitor);
}
