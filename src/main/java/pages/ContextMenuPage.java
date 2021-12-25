package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenuField = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickContextMenu(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(contextMenuField)).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void clickAlertOkBtn(){
        driver.switchTo().alert().accept();
    }
}
