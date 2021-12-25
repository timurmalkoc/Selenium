package alert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenu extends BaseTest {
    @Test
    public void contextMenuTest() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickContextMenu();
        String expected = "You selected a context menu";
        assertEquals(contextMenuPage.getAlertText(),expected, "Fail to right click");
        contextMenuPage.clickAlertOkBtn();
    }
}
