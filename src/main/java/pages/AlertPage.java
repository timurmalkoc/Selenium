package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By javaAlertBtn = By.xpath(".//button[text()='Click for JS Alert']");
    private By javaConfirmBtn = By.xpath(".//button[text()='Click for JS Confirm']");
    private By javaPromptBtn = By.xpath(".//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertBtn(){
        driver.findElement(javaAlertBtn).click();
    }
    public void clickOkBtn(){
        driver.switchTo().alert().accept();
    }
    public String getAlertResultText(){
        return driver.findElement(resultText).getText();
    }

    public void clickConfirmBtn(){
        driver.findElement(javaConfirmBtn).click();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void clickCancelBtn(){
        driver.switchTo().alert().dismiss();
    }

    public void clickPromptBtn(){
        driver.findElement(javaPromptBtn).click();
    }

    public void clickAcceptBtn(){
        driver.switchTo().alert().accept();
    }

    public void setInputText(String text){
        driver.switchTo().alert().sendKeys(text);
    }


}
