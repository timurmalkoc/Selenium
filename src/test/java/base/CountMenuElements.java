package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountMenuElements {
    WebDriver driver;

    public void startUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shifting = driver.findElement(By.linkText("Shifting Content"));
        shifting.click();

        WebElement menu = driver.findElement(By.linkText("Example 1: Menu Element"));
        menu.click();

        List<WebElement> menuItems = driver.findElements(By.xpath("//li/a"));
        System.out.println("Total items = " + menuItems.size());
        printList(menuItems);

        driver.quit();
    }



    public static void main(String[] args) {
        CountMenuElements count = new CountMenuElements();
        count.startUp();
    }

    public static void printList(List<WebElement> items){
        int i= 0;
        for (WebElement item:items){
            System.out.println(++i + ". item = "+ item.getText());
        }
    }
}
