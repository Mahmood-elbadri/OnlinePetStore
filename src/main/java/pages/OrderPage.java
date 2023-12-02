package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends PageBase{
    @FindBy(linkText = "Return to Main Menu")
    private WebElement returnBtn;
    public OrderPage(WebDriver driver) {
        super(driver);
    }
    public void clickReturn(){
        returnBtn.click();
    }
}
