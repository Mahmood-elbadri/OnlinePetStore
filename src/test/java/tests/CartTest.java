package tests;

import org.testng.annotations.Test;
import pages.AddToCartPage;

public class CartTest extends TestBase{
    AddToCartPage cart;
    @Test
    public void addItemToCart(){
        cart = new AddToCartPage(driver);
        cart.setAddCartBtn();
    }
}
