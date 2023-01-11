package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfingReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfingReader.getProperty("amazonUrl"));

    }
    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }
    @And("arama sonuclarinin Nutellla icerdigini test eder")
    public void aramaSonuclarininNutelllaIcerdiginiTestEder() {

        String actualKelime = amazonPage.aramaSonucElementi.getText();
        String expectedKelime ="Nutella";

        Assert.assertTrue(actualKelime.contains(expectedKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }


}
