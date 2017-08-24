package behavioural.iterator;

import java.util.Iterator;

public class ProductRepository implements Iterable<Product>{

    private Product[] products = new Product[10];
    private int index = 0;

    public void add(Product product) {
        if(index == products.length) {
            Product[] largerProducts = new Product[products.length + 10];
            System.arraycopy(products, 0, largerProducts, 0, products.length);
            products = largerProducts;
            largerProducts = null;
        }
        products[index++] = product;
    }

    @Override
    public Iterator<Product> iterator() {
        Iterator<Product> iterator = new Iterator<Product>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < products.length && products[index] != null;
            }

            @Override
            public Product next() {
                return products[index++];
            }
        };
        return iterator;
    }
}
