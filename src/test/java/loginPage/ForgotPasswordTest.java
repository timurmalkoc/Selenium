package loginPage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void forgotPassword(){
        ForgotPasswordPage password = homePage.clickForgotPassword();
        password.setEmailField("malkov@gmail.com");
        ConfirmationPage confirm = password.clickRetrieveBtn();
        System.out.println(confirm.getAlert());

    }

}
