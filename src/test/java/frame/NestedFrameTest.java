package frame;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFrameTest extends BaseTest {
    @Test
    public void testNestedFrames(){
        FramesPage frame = homePage.clickFrame();
        NestedFramesPage nestedFrames = frame.clickNestedField();
        String expectedLeft = "LEFT";
        assertEquals(nestedFrames.getLeftFrameText(),expectedLeft,"Text does not match");
        String expectedBottom = "BOTTOM";
        assertEquals(nestedFrames.getBottomFrameText(),expectedBottom,"Text does not match");
    }

    @Test
    public void testNestedMiddle(){
        FramesPage framesPage = homePage.clickFrame();
        NestedFramesPage page = framesPage.clickNestedField();
        System.out.println(page.getMiddleFrameText());

    }
}
