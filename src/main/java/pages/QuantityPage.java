package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class QuantityPage extends PageBase {
    WebDriverWait wait;
    @FindBy(xpath = "//input[@name='EST-13']")
    private WebElement quantityBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement updateCartBtn;
    @FindBy(xpath = "//a[@class='button' and @href='/order/newOrderForm']")
    private WebElement proceedCheckBtn;

    public QuantityPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void setQuantity(int Number) throws InterruptedException {
        quantityBox.clear();
        String number = Integer.toString(Number);
        quantityBox.sendKeys(number);
        updateCartBtn.click();
        proceedCheckBtn.click();
        Set<String> windowHandles = driver.getWindowHandles();
        // Switch back to the main tab (assuming it's the first one)
        String mainTabHandle = windowHandles.iterator().next();
        driver.switchTo().window(mainTabHandle);
    }
}
