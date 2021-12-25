package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;

    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setInputField(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void setPi(){
        setInputField(Keys.chord(Keys.CONTROL,"a"));
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }


}
