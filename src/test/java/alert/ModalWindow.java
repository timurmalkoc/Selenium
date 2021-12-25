package alert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ModalWindowPage;

import static org.testng.Assert.assertEquals;

public class ModalWindow extends BaseTest {

    @Test
    public void modalWindowCancelTest() {
        ModalWindowPage modalWindowPage = homePage.clickModalWindow();
        modalWindowPage.clickClose();
        assertEquals(modalWindowPage.closeConfirmationText(),"Entry Ad","Close failed");
    }
}
