package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase{
    HomePage home;
    @Test
    public void selectAnimal(){
        home = new HomePage(driver);
        home.clickAnimalType();
    }
}
