package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalWindowPage {
    private WebDriver driver;

    private By cancelModel = By.xpath(".//div[contains(@class,'modal-footer')]");
    private By text = By.tagName("h3");

    public ModalWindowPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickClose(){
        driver.findElement(cancelModel).click();
    }

    public String closeConfirmationText(){
        return driver.findElement(text).getText();
    }
}
