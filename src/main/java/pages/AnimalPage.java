package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnimalPage extends PageBase{
    @FindBy(linkText = "RP-LI-02")
    private WebElement productId;
    public AnimalPage(WebDriver driver) {
        super(driver);
    }

    public void setProductId() {
        productId.click();
    }
}
