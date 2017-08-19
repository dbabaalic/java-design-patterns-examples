package behavioural.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductOrder {

    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void accept(ProductVisitor productVisitor) {
        for(Product product : products) {
            product.accept(productVisitor);
        }
        productVisitor.visit(this);
    }
}
