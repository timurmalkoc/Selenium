package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicExam1;
import pages.DynamicExam2;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class DynamicExamplesTest extends BaseTest {
    @Test
    public void dynamicExample1Test(){
        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        DynamicExam1 exam1 = loadingPage.clickExample1();
        exam1.clickStartBtn();
        String expectedText = "Hello World!";
        assertEquals(exam1.loadedText(),expectedText,"Text does not match");
    }

    @Test
    public void dynamicExample2Test(){
        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        DynamicExam2 exam2 = loadingPage.clickExample2();
        exam2.clickStartBtn();
        String expectedText = "Hello World!";
        assertEquals(exam2.loadedText(),expectedText,"Text does not match");
    }
}
