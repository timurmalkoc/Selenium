package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1","incorrect caption");
        assertEquals(caption.getLinkText(),"View profile","Caption link is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");

    }


}
