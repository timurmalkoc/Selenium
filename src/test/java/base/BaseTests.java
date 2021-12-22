package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        // setting custom dimension (phone)
        //driver.manage().window().setSize(new Dimension(375,812));
        System.out.println(driver.getTitle());

        WebElement input = driver.findElement(By.linkText("Inputs"));
        input.click();

        List<WebElement> elements = driver.findElements(By.tagName("a"));

        // close, closes the current webpage
        //driver.close();
        // quit, closes the browser and ends the session
        System.out.println("Total element with a tag = "+ elements.size());

        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests baseTests = new BaseTests();
        baseTests.setUp();
    }
}
