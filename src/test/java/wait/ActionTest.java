package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicExam1;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertTrue;

public class ActionTest extends BaseTest {
    @Test
    public void dynamicExample1Test(){
        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        DynamicExam1 exam1= loadingPage.rightClickExample1();
        getWindowManager().switchToTab(2);
        assertTrue(exam1.isStartBtnDisplayed(),"Start button is not exist");

    }
}
