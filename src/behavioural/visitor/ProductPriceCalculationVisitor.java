package behavioural.visitor;

import java.util.List;

public class ProductPriceCalculationVisitor implements ProductVisitor {

    private int price;

    @Override
    public void visit(Milk milk) {
        price += 100;
    }

    @Override
    public void visit(Chocolate chocolate) {
        price += 120;
    }

    @Override
    public void visit(Pudding pudding) {
        price += 50;
    }

    @Override
    public void visit(ProductOrder productOrder) {
        List<Product> products = productOrder.getProducts();
        if (products.size() > 3){
            price = price * 80/100;
        }
        System.out.println("Price of products is: " + price);
    }

}
