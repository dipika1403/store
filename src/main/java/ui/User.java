package ui;

import model.Cart;
import model.LineItem;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class User {
    /**
     * As a customer, if I haven’t put anything into my cart, the cart is empty.
     * As a customer, I can add a product to the cart, and the cart will display a quantity of 1 of that product, in that line item.
     * As a customer, I can increase the quantity of a line item by 1.
     * As a customer, I can decrease the quantity of a line item by 1. If I decrease it to 0, the line item disappears.
     * As a customer, I can see the discounted price of each line item in my cart (product price X quantity of that product).
     * As a customer, I can see the un-discounted price of each line item in my cart, so I can see how much I’m saving.
     * As a customer, I can see the total, discounted price of all line items in my cart.
     * As a customer, I can see the total, un-discounted price of all line items in my cart.
     **/

    Cart cart = new Cart();
    private int ch = 0;

    public User() {
        showOrder();
    }

    public void storeProductsMenu() {
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item From Cart");
            System.out.println("0. Exit");
        }

    //1
    public void startCart() {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("0. Exit");
    }

    //menu()
    public void showOrder() {

        do {
            startCart();
            getUserInput();

            switch (ch) {
                case 1:
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (ch != 0);


    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:

                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
        List<Product> products = new LineItem().getProducts();
        for (Product prod : products) {
            System.out.println(
                    prod.getPid() + "- " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }


    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}
