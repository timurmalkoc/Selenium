package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.MultipleWindowPage;

public class NavigationTest extends BaseTest {

    @Test
    public void navigatorTest(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }

    @Test
    public void tabSwitchTest(){
        homePage.clickMultipleWindow().clickHereLink();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void tabSwitchTest2(){
        MultipleWindowPage multipleWindowPage = homePage.clickMultipleWindow();
        String parent = multipleWindowPage.getParentText();
        String child = multipleWindowPage.clickHereLink();
        System.out.println("parent window = " + parent +
                "\n child window = " + child );

    }
}
