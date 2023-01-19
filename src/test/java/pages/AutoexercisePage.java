package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoexercisePage {

    public AutoexercisePage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLinki;

    @FindBy (xpath = "//input[@data-qa='signup-name']")
    public WebElement isimKutusu;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement emailKutusu;

    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButonu;

    @FindBy (xpath = "//input[@id='id_gender1']")
    public WebElement mrRadioButonu;

    @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement creatAccountButonu;

    @FindBy (xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziElementi;

}
