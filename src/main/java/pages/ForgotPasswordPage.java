package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePassword = By.tagName("i");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public ConfirmationPage clickRetrieveBtn(){
        driver.findElement(retrievePassword).click();
        return new ConfirmationPage(driver);
    }
}
