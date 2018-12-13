package model;

import java.util.ArrayList;
import java.util.List;

public class LineItem {
    //quantity
    //what you buying
    //total price

    private final List<Product> lineItems = new ArrayList<Product>();

    public LineItem() {
        this.initStoreItems();
    }

    public List<Product> getProducts() {
        return lineItems;
    }

    public void initStoreItems() {
        String [] lineItemNames = {"Louis Vuitton", "Rolex Watch", "Gucci Purse"};
        Double [] lineItemPrice = {500.00d, 700.00d, 400.00d};
        Integer [] stock = {8, 7, 15};

        for (int i=0; i < lineItemNames.length; i++) {
            this.lineItems.add(new Product(i+1, lineItemNames[i], lineItemPrice[i], stock[i]));
        }
    }
}
