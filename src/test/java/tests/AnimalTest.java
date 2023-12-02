package tests;

import org.testng.annotations.Test;
import pages.AnimalPage;

public class AnimalTest extends TestBase{
    AnimalPage animal;
    @Test
    public void chooseAnimal(){
        animal = new AnimalPage(driver);
        animal.setProductId();
    }
}
