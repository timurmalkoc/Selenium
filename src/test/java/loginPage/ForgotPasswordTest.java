package loginPage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.ForgotPassword;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void forgotPassword(){
        ForgotPassword password = homePage.clickForgotPassword();
        password.setEmailField("malkov@gmail.com");
        ConfirmationPage confirm = password.clickRetrieveBtn();
        System.out.println(confirm.getAlert());

    }

}
