package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.Set;

public class WebUniversityStepdefinitions {
    WebUniversityPage webUniversityPage = new WebUniversityPage();
    String ilkSayfaHandleDegeri;

    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {
        webUniversityPage.asagiIndirme.sendKeys(Keys.PAGE_DOWN);

    }
    @Then("Login portala tiklar")
    public void login_portala_tiklar() {
        ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalButonu.click();
    }
    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
        // eger yeni window'a geciyorsa, yeni window acilmadan
        // ilk sayfanin window handle degerini kaydetmeliyiz

        Set<String> tumSayfaHandles = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWHD= "";
        for (String eachWHD : tumSayfaHandles) {

            if (!eachWHD.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaWHD=eachWHD;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
    }

    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
        webUniversityPage.usernameKutusu.sendKeys("Tugay");
    }

    @Then("password kutuuna deger yazar")
    public void password_kutuuna_deger_yazar() {
        webUniversityPage.passwordKutusu.sendKeys("123456");
    }

    @Then("webuniversity login butonuna basar")
    public void webuniversity_login_butonuna_basar() {
        webUniversityPage.loginButtonu.click();
    }

    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {

        String actualYazi = Driver.getDriver().switchTo().alert().getText();
        String exceptedYazi = "validation failed";

        Assert.assertEquals(actualYazi,exceptedYazi);
    }

    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {

        Driver.closeDriver();
    }

    @Then("ilk dondugunu test eder")
    public void ilk_dondugunu_test_eder() {

        Assert.assertTrue(webUniversityPage.gorunurLoginPortal.isDisplayed());

    }
}