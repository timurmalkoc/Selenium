package javaScript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class TestJS extends BaseTest {
    @Test
    public void largeAndDeepDOM(){
        LargeAndDeepDomPage deepDom = homePage.clickDeepDom();
        deepDom.scrollToTable();
    }
}
