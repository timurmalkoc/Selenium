package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    // private By formAuthentication = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        // driver.findElement(formAuthentication).click();
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }
    public void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
