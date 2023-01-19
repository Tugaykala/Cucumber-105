package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoexercisePage {

    public AutoexercisePage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (linkText = " Signup / Login")
    public WebElement signUpButonu;


}
