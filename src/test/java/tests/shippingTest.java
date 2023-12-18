package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PaymentPage;
import Data.ExcelReader;


import java.io.IOException;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class shippingTest extends TestBase {
    PaymentPage pay;

    @DataProvider(name = "shippingData")
    public Object[][] data() throws IOException {
        ExcelReader er = new ExcelReader();
        return er.getExcelData();
    }

    @Test(dataProvider = "shippingData")
    public void testPay(String numberCredit, String expire, String firstName,
                        String lastName, String address, String addressTwo, String billCity,
                        String state, String billZip, String country) {
        pay = new PaymentPage(driver);
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance();
        DecimalFormatSymbols symbols = decimalFormat.getDecimalFormatSymbols();
        char decimalSeparator = symbols.getDecimalSeparator();
        pay.shippingData(numberCredit, expire, firstName, lastName, address, addressTwo, billCity, state, String.valueOf(billZip).replace(String.valueOf(decimalSeparator), ""), country);
        Assert.assertTrue(false);
    }
}
