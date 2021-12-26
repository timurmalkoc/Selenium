package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {
    private WebDriver driver;
    private By iFramePage = By.id("mce_0_ifr");
    private By textArea = By.id("tinymce");
    private By tabBtn = By.cssSelector("button[aria-label='Increase indent']");

    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchEditor(){
        driver.switchTo().frame(driver.findElement(iFramePage));
    }

    public void clearTextArea(){
        switchEditor();
        driver.findElement(textArea).clear();
        switchToMainParentPage();
    }

    public void setTextArea(String text){
        switchEditor();
        driver.findElement(textArea).sendKeys(text);
        switchToMainParentPage();
    }

    private void switchToMainParentPage(){
        driver.switchTo().parentFrame();
    }

    public String getText(){
        switchEditor();
        String text = driver.findElement(textArea).getText();
        switchToMainParentPage();
        return text;
    }

    public void makeTab(String text){
        switchEditor();
        driver.findElement(textArea).sendKeys(text);
        switchToMainParentPage();
        driver.findElement(tabBtn).click();
        switchEditor();
        driver.findElement(textArea).sendKeys(text);
        switchToMainParentPage();
    }

}
