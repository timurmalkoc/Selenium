package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    private WebDriver driver;
    private By alert = By.tagName("h1");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlert(){
        return driver.findElement(alert).getText();
    }
}
