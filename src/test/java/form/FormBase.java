package form;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import webForm.FormHomePage;


public class FormBase {
    private WebDriver driver;
    protected FormHomePage formHomePage;

    @BeforeClass
    public void pageSetUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        formHomePage = new FormHomePage(driver);
    }



}
