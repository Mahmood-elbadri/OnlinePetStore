package pages;

import org.checkerframework.checker.initialization.qual.FBCBottom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[3]")
    private WebElement animalType;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickAnimalType() {
        animalType.click();
    }
}
