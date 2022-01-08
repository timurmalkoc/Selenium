package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By topFrame = By.name("frame-top");
    private By leftFrame = By.name("frame-left");
    private By middleFrame = By.name("frame-middle");
    private By textArea = By.tagName("body");

    private By bottomFrame = By.name("frame-bottom");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(driver.findElement(topFrame)).switchTo().frame(driver.findElement(leftFrame));
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(driver.findElement(bottomFrame));
    }

    private void switchToParentFrame(){
        driver.switchTo().parentFrame().switchTo().parentFrame();
    }

    public String getLeftFrameText(){
        switchToLeftFrame();
        String text = driver.findElement(textArea).getText();
        switchToParentFrame();
        return text;
    }
    private void switchToMiddleFrame(){
        driver.switchTo().frame(driver.findElement(topFrame)).switchTo().frame(driver.findElement(middleFrame));
    }
    public String getMiddleFrameText(){
        switchToMiddleFrame();
        String text = driver.findElement(textArea).getText();
        switchToParentFrame();
        return text;
    }

    public String getBottomFrameText(){
        switchToBottomFrame();
        String text = driver.findElement(textArea).getText();
        switchToParentFrame();
        return text;
    }

}
