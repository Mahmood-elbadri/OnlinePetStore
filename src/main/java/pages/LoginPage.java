package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    @FindBy(xpath = "//div[@class='button-bar']//button[text()='Login']")
    private WebElement loginBtn;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickLogin(){
        loginBtn.click();
    }
}
