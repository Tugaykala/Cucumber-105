package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfingReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {

        qualitydemyPage.ilkLoginLinki.click();

    }

    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenUsername) {

        qualitydemyPage.EmailKutusu.sendKeys(ConfingReader.getProperty(istenenUsername));

    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {

        qualitydemyPage.passwordKutusu.sendKeys(ConfingReader.getProperty(istenenPassword));

    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {

        qualitydemyPage.loginButonu.click();

    }

    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {

        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());

    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(qualitydemyPage.EmailKutusu.isDisplayed());
    }

    @Then("cookies kapatir")
    public void cookiesKapatir() {

        qualitydemyPage.cookies.click();
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {

        }
    }

    @And("kullanici kutusuna manuel olarak {string} yazar")
    public void kullaniciKutusunaManuelOlarakYazar(String username) {

        qualitydemyPage.EmailKutusu.sendKeys(username);
    }

    @And("password kutusuna manuel olarak {string} yazar")
    public void passwordKutusunaManuelOlarakYazar(String password) {

        qualitydemyPage.passwordKutusu.sendKeys(password);
    }
}

