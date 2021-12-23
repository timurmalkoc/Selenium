package webForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormyPage {
    private WebDriver driver;
    private By alert = By.xpath("//*[contains(@class,'alert')]");

    public FormyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlert() {
        System.out.println(driver.findElement(alert).getText());
        return driver.findElement(alert).getText();
    }
}
