package frame;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.IFramePage;

import static org.testng.Assert.assertEquals;

public class IFrameTest extends BaseTest {
    @Test
    public void clickIframeTest() {
        FramesPage frames = homePage.clickFrame();
        IFramePage iFrame= frames.clickIFrame();
        iFrame.clearTextArea();
        String text = "Hello World";
        iFrame.setTextArea(text);
        assertEquals(iFrame.getText(),text,"Text does not match");
        iFrame.makeTab(text);
    }


}
