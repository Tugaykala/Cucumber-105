package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.ConfingReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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

        amazonPage = new AmazonPage();
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        String expectedKelime = "Nutella";

        Assert.assertTrue(actualKelime.contains(expectedKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        String expectedKelime = "Java";

        Assert.assertTrue(actualKelime.contains(expectedKelime));
    }

    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Samsung" + Keys.ENTER);
    }

    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {

        String actualKelime = amazonPage.aramaSonucElementi.getText();
        String expectedKelime = "Samsung";

        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime ) {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);

    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime ) {
        String actualKelime = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualKelime.contains(arananKelime));
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfingReader.getProperty(istenenUrl));

    }

    @Then("Url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(arananKelime));

    }

    @And("acilan tum sayfalari kapatir")
    public void acilanTumSayfalariKapatir() {
        Driver.quitDriver();
    }
    @And("cikan urunler icinde {string} oldugunu test eder")
    public void cikanUrunlerIcindeOldugunuTestEder(String arananUrun) {

        List<WebElement> sonucUrunIsimElementlerList = amazonPage.sonucUrunIsimElementleriList;

        List<String> sonucUrunIsimElementiStr = ReusableMethods.getElementsText(sonucUrunIsimElementlerList);

        // Assert.assertTrue(sonucUrunIsimElementiStr.contains(arananUrun));

        boolean iceriyorMu = false;
        for (String eachElement : sonucUrunIsimElementiStr) {

            if (eachElement.contains(arananUrun)){
                iceriyorMu=true;
                break;
            }
        }
        Assert.assertTrue(iceriyorMu);
    }

    @And("cikan urunlerden {string} kelimesi icerenlerin fiyat oratlamasinin {int} euro altinda oldugunu test eder")
    public void cikanUrunlerdenKelimesiIcerenlerinFiyatOratlamasininEuroAltindaOldugunuTestEder(String arananUrun, int ortalamaFiyat) {

        List<WebElement> aramaSonucDeteyliIsimElementleriListesi = amazonPage.aramaSonucDetayliIsimElementleriList;

        int siraNo = 1;
        int toplamFiyat =0;
        for (WebElement each : aramaSonucDeteyliIsimElementleriListesi) {

            String urunFiyatiStr = each.getText();
            urunFiyatiStr = urunFiyatiStr.replaceAll("\\D","");

            System.out.println(siraNo + "---" + urunFiyatiStr);
            siraNo++;

            Integer urunFiyatInt = Integer.parseInt(urunFiyatiStr);
            toplamFiyat += urunFiyatInt;
        }

        double actualOrtalamaFiyat = (double) toplamFiyat / (siraNo*100);

        System.out.println(actualOrtalamaFiyat);

        Assert.assertTrue(actualOrtalamaFiyat<ortalamaFiyat);

    }
}