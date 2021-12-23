package loginPage;

import pages.LoginPage;
import pages.SecureAreaPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
    LoginPage login = homePage.clickFormAuthentication();
    login.setUserNameField("tomsmith");
    login.setPasswordField("SuperSecretPassword!");
    SecureAreaPage secureAreaPage = login.clickLoginButton();

    assertTrue(secureAreaPage.getAlertText()
                    .contains( "You logged into a secure area!"),
                            "Alert test is incorrect");
    }
}
