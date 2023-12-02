package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuantityPage extends PageBase{
    @FindBy(xpath = "//input[@name='EST-13']")
    private WebElement quantityBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement updateCartBtn;
    @FindBy(xpath = "//a[@class='button' and @href='/order/newOrderForm']")
    private WebElement proceedCheckBtn;
    public QuantityPage(WebDriver driver) {
        super(driver);
    }
    public void setQuantity(int Number){
        quantityBox.clear();
        quantityBox.sendKeys(Integer.toString(Number));
        updateCartBtn.click();
        proceedCheckBtn.click();
    }
}
