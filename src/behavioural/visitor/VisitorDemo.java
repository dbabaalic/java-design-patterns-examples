package behavioural.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.addProduct(new Milk());
        productOrder.addProduct(new Pudding());
        productOrder.addProduct(new Chocolate());
        productOrder.addProduct(new Chocolate());

        productOrder.accept(new ProductPriceCalculationVisitor());
        System.out.println("------------------------------------");
        productOrder.accept(new ProductDisplayVisitor());


    }

}
