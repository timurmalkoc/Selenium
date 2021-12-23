package webForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FormHomePage {
    private WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By jobTileField = By.id("job-title");
    private By highSchool = By.id("radio-button-1");
    private By collage = By.id("radio-button-2");
    private By gradSchool = By.id("radio-button-3");
    private By male = By.id("checkbox-1");
    private By female = By.id("checkbox-2");
    private By notToSay = By.id("checkbox-3");
    private By experience = By.id("select-menu");
    private By date = By.id("datepicker");
    private By submitBtn = By.linkText("Submit");

    public FormHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setJobTileField(String jobTile) {
        driver.findElement(jobTileField).sendKeys(jobTile);
    }

    public void setHighSchool(){
        driver.findElement(highSchool).click();
    }

    public void setCollage(){
        driver.findElement(collage).click();
    }

    public void setGradSchool(){
        driver.findElement(gradSchool).click();
    }

    public void setMale(){
        driver.findElement(male).click();
    }

    public void setFemale(){
        driver.findElement(female).click();
    }

    public void setNotToSay(){
        driver.findElement(notToSay).click();
    }

    public void setExperience(int year){
        int value;
        if (year>=0 && year<=1)
            value = 0;
        else if (year>=2 && year<=4)
            value = 1;
        else if (year>=5 && year<=9)
            value = 2;
        else
            value =3;

    }

    public void setDate(int index){

    }

    public FormyPage submit(){
        driver.findElement(submitBtn).click();
        return new FormyPage(driver);
    }
}
