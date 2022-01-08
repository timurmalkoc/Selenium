package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");
    private By parentTextFiled = By.tagName("h3");

    public MultipleWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    public String clickHereLink(){
        driver.findElement(clickHereLink).click();
        NewWindow newTab = new NewWindow(driver);
        return newTab.getTextMessage();
    }

    public String getParentText(){
        return driver.findElement(parentTextFiled).getText();
    }
}
