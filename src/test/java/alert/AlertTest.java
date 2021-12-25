package alert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void clickAlertBtnTest() {
        AlertPage alertPage = homePage.clickAlert();
        alertPage.clickAlertBtn();
        alertPage.clickOkBtn();

        assertEquals(alertPage.getAlertResultText(),"You successfully clicked an alert", "Fail to click on accept btn");
    }

    @Test
    public void clickAlertToCancel(){
        AlertPage alertPage = homePage.clickAlert();
        alertPage.clickConfirmBtn();
        assertEquals(alertPage.getAlertText(),"I am a JS Confirm", "Alert text is incorrect");
        alertPage.clickCancelBtn();
        assertEquals(alertPage.getAlertResultText(),"You clicked: Cancel");
    }

    @Test
    public void clickPromptBtn(){
        AlertPage alertPage = homePage.clickAlert();
        alertPage.clickPromptBtn();
        String text = "Hello World";
        alertPage.setInputText(text);
        alertPage.clickAcceptBtn();
        assertEquals(alertPage.getAlertResultText(),"You entered: "+text,"Text does not match");

    }
}
