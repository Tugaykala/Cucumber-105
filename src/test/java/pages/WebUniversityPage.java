package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {

    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalButonu;

    @FindBy (xpath = "//a[text()='Selenium Webdriver 4 New Features In Detail']")
    public WebElement asagiIndirme;

    @FindBy (id = "text")
    public WebElement usernameKutusu;

    @FindBy (id = "password")
    public  WebElement passwordKutusu;

    @FindBy (id = "login-button")
    public WebElement loginButtonu;

    @FindBy (xpath = "//h4[text()='Login Portal']")
    public WebElement gorunurLoginPortal;


}
