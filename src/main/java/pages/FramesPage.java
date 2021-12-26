package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedFramesLink = By.xpath(".//a[contains(@href,'/nested_frames')]");
    private By iFrameLink = By.xpath(".//a[contains(@href,'/iframe')]");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedField(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }

    public IFramePage clickIFrame(){
        driver.findElement(iFrameLink).click();
        return new IFramePage(driver);
    }
}
