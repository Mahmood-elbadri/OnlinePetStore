package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase{
    LoginPage login;
    @Test
    public void testLogin(){
        login = new LoginPage(driver);
        login.clickLogin();
    }
}
