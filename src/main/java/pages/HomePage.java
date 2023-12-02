package pages;

import org.checkerframework.checker.initialization.qual.FBCBottom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    @FindBy(linkText = "Reptiles")
    private WebElement animalType;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickAnimalType() {
        animalType.click();
    }
}
