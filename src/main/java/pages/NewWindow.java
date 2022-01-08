package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class NewWindow {
    private WebDriver driver;
    private By textBox = By.tagName("h3");
    public NewWindow(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextMessage(){
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();
        System.out.println("parent = " + parent + ", child = " + child);

        driver.switchTo().window(child);

        String text = driver.findElement(textBox).getText();

        driver.switchTo().window(parent);
        return text;
    }

}
