package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicExam2 {
    private WebDriver driver;
    private By startBtn = By.xpath(".//div[contains(@id,'start')]/button");
    private By loadingIndicator = By.id("loading");
    private By confirmationText = By.id("finish");

    public DynamicExam2(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn(){
        driver.findElement(startBtn).click();

         WebDriverWait wait = new WebDriverWait(driver,5);
         wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));


//        FluentWait wait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String loadedText(){
        return driver.findElement(confirmationText).getText();
    }
}
