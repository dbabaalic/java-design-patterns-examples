package behavioural.iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ProductRepository products = new ProductRepository();
        products.add(new Product("shoes"));
        products.add(new Product("hat"));
        products.add(new Product("shirt"));

        Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()) {
            System.out.println(productIterator.next());
        }

        System.out.println("-------------------------------------");

        //now we can do this
        for(Product product : products){
            System.out.println(product);
        }

    }
}
