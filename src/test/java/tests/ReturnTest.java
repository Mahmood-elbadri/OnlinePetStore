package tests;

import org.testng.annotations.Test;
import pages.OrderPage;

public class ReturnTest extends TestBase{
    OrderPage order;
    @Test
    public void backTest(){
        order = new OrderPage(driver);
        order.clickReturn();
    }
}
