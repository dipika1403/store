package ui;


import model.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class UserTest {

    @Test
    public void showCartTest(){
        private Product product1;
        private Product product2;
        private Product product3;
        private Cart cart;

        @Before
        public void setUp() throws Exception {
            product1 = Mockito.mock(Product.class);
            when(product1.getName()).thenReturn("A");
            when(product1.getPrice()).thenReturn(new BigDecimal(10.5));

            product2 = Mockito.mock(Saleable.class);
            when(product2.getName()).thenReturn("B");
            when(product2.getPrice()).thenReturn(new BigDecimal(6.8));

            product3 = Mockito.mock(Saleable.class);
            when(product3.getName()).thenReturn("C");
            when(product3.getPrice()).thenReturn(new BigDecimal(7.4));

            cart = new Cart();
            cart.add(product1, 2);
            cart.add(product2, 1);
        }

        @Test
        public void addToCartTest(){

//            assertTrue(cart.addToCart(), 2+1+1);
        }









    }

}
