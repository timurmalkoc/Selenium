package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import util.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void pageSetup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        // implicit wait
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // script timeout -> wait until page sync with other apps like JS.


        driver.get("https://the-internet.herokuapp.com/");
        goHome();

        homePage = new HomePage(driver);

    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }


    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    // run for all methods but take shot for fail tests
    @AfterMethod
    public void recordFailure(ITestResult result)  {
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot cam = (TakesScreenshot) driver;
            File screenshot = cam.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+ result.getTestName() +".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
