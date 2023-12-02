package tests;

import org.testng.annotations.Test;
import pages.QuantityPage;

public class QuantityTest extends TestBase {
    QuantityPage quantity;
    @Test
    public void setQuantityTest() throws InterruptedException {
        quantity = new QuantityPage(driver);
        quantity.setQuantity(20);
    }
}
