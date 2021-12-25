package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.xpath("//input[@type='range']");
    private By sliderText = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void leftClick(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public void leftClickUntilValue(Double value){
        while (value>(Double.parseDouble(getValue()))){
            leftClick();
        }
    }

    public String getValue(){
        return driver.findElement(sliderText).getText();
    }
}
