package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Hidden = By.cssSelector("a[href='/dynamic_loading/1']");
    private By example2Hidden = By.cssSelector("a[href='/dynamic_loading/2']");
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicExam1 clickExample1(){
        driver.findElement(example1Hidden).click();
        return new DynamicExam1(driver);
    }

    public DynamicExam2 clickExample2(){
        driver.findElement(example2Hidden).click();
        return new DynamicExam2(driver);
    }

    public DynamicExam1 rightClickExample1() {
        Actions action = new Actions(driver);
        WebElement btn = driver.findElement(example1Hidden);
        action.moveToElement(btn);
        action.keyDown(Keys.CONTROL).click().perform();

        return new DynamicExam1(driver);

    }

}
