package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTest {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPresses = homePage.clickKeyPress();

        keyPresses.setInputField("A"+ Keys.BACK_SPACE);
        assertEquals(keyPresses.getResultText(),"You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPresses = homePage.clickKeyPress();

        keyPresses.setPi();
        System.out.println(keyPresses.getResultText());

    }
}
