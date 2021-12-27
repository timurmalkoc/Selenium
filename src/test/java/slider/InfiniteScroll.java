package slider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class InfiniteScroll extends BaseTest {
    @Test
    public void infiniteScrollTest(){
        InfiniteScrollPage scroll = homePage.clickInfiniteScroll();
        scroll.scrollToParagraph(5);
    }
}
