package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PaymentPage;
import Data.ExcelReader;


import java.io.IOException;

public class shippingTest extends TestBase {
    PaymentPage pay;

    @DataProvider(name = "shippingData")
    public Object[][] data() throws IOException {
        ExcelReader er = new ExcelReader();
        return er.getExcelData();
    }

    @Test(dataProvider = "shippingData")
    public void testPay(String cartTyp, String numberCredit, String expire, String firstName,
                        String lastName, String address, String addressTwo, String billCity,
                        String state, String billZip, String country) {
        pay = new PaymentPage(driver);
        pay.shippingData(cartTyp, numberCredit, expire, firstName, lastName, address, addressTwo, billCity, state, billZip, country);
    }
}
