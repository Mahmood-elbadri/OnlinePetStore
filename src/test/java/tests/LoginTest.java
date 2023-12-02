package tests;

import pages.LoginPage;

public class LoginTest extends TestBase{
    LoginPage login;
    public void testLogin(){
        login.clickLogin();
    }
}
