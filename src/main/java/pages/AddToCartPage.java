package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase{
    @FindBy(linkText = "Add to Cart")
    private WebElement addCartBtn;
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    public void setAddCartBtn() {
        addCartBtn.click();
    }
}
