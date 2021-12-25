package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadText = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadBtn(){
        driver.findElement(uploadBtn).click();
    }

    public void uploadFile(String pathOfFile){
        driver.findElement(inputField).sendKeys(pathOfFile);
        clickUploadBtn();
    }

    public String getUploadedFileText(){
        return driver.findElement(uploadText).getText();
    }

}
