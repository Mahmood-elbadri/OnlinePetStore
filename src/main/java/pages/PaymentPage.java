package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends PageBase {
    Select dropDown;
    @FindBy(name = "cardType")
    private WebElement cartType;
    @FindBy(name = "creditCard")
    private WebElement creditNumber;
    @FindBy(name = "expiryDate")
    private WebElement expiryDate;
    @FindBy(name = "billToFirstName")
    private WebElement fName;
    @FindBy(name = "billToLastName")
    private WebElement lname;
    @FindBy(name = "billAddress1")
    private WebElement address1;
    @FindBy(name = "billAddress2")
    private WebElement address2;
    @FindBy(name = "billCity")
    private WebElement city;
    @FindBy(name = "billState")
    private WebElement billState;
    @FindBy(name = "billZip")
    private WebElement zip;
    @FindBy(name = "billCountry")
    private WebElement billCountry;
    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueBtn;
    public PaymentPage(WebDriver driver) {
        super(driver);

    }

    public void shippingData(String cartTyp, String numberCredit, String expire, String firstName, String lastName,
                             String address, String addressTwo, String billCity, String state, String billZip, String country) {
        dropDown = new Select(cartType);
        dropDown.selectByValue(cartTyp);
        creditNumber.clear();
        creditNumber.sendKeys(numberCredit);
        expiryDate.clear();
        expiryDate.sendKeys(expire);
        fName.clear();
        fName.sendKeys(firstName);
        lname.clear();
        lname.sendKeys(lastName);
        address1.clear();
        address1.sendKeys(address);
        address2.clear();
        address2.sendKeys(addressTwo);
        city.clear();
        city.sendKeys(billCity);
        billState.clear();
        billState.sendKeys(state);
        zip.clear();
        zip.sendKeys(billZip);
        billCountry.clear();
        billCountry.sendKeys(country);
        continueBtn.click();
    }
}
