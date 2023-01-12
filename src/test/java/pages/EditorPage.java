package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "(//button[@aria-controls='example'])[1]")
    WebElement newButonu;

    @FindBy (id = "DTE_Field_first_name")
    WebElement firstName;

    @FindBy (id = "DTE_Field_last_name")
    WebElement lastName;

    @FindBy (id = "DTE_Field_position")
    WebElement position;

    @FindBy (id = "DTE_Field_office")
    WebElement office;

    @FindBy (id = "DTE_Field_extn")
    WebElement extension;

    @FindBy (id = "DTE_Field_start_date")
    WebElement startDate;

    @FindBy (id = "DTE_Field_salary")
    WebElement salary;

    @FindBy (xpath = "//div[@class='DTE_Form_Buttons']")
    WebElement creatButonu;

    @FindBy (xpath = "//input[@type='search']")
    WebElement searchKutusu;

    @FindBy (xpath = "//td[@class='sorting_1']")
    WebElement ilkIsimElementi;


}
