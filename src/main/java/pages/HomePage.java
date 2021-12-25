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

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPress(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertPage clickAlert(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public FileUploadPage clickUploadFile(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ModalWindowPage clickModalWindow(){
        clickLink("Entry Ad");
        return new ModalWindowPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
