package hepsiburada.tests.day01;

import hepsiburada.pages.Hepsiburada;
import hepsiburada.utilities.ConfigReader;
import hepsiburada.utilities.Driver;
import hepsiburada.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C01_Hepsiburada_Login {

    /* "https://www.hepsiburada.com/" adresine git
    cerezleri kabul et
    login yap

     */
    @Test
    public void loginTest() {
        // "https://www.hepsiburada.com/" adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada_Url"));

        //cerezleri kabul et
        Hepsiburada hepsiburada=new Hepsiburada();
        hepsiburada.cerezPolitikasiKabulButonu.click();

        //login yap
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hepsiburada.giris).perform();
        ReusableMethods.bekle(3);
        hepsiburada.login.click();
        ReusableMethods.bekle(3);

        hepsiburada.emailGirKutusu.click();
        hepsiburada.emailGirKutusu.sendKeys(ConfigReader.getProperty("hepsiburada_email" ),Keys.TAB);
        hepsiburada.girisYap.click();

        hepsiburada.sifreGirKutusu.sendKeys(ConfigReader.getProperty("hepsiburada_password"), Keys.ENTER);
        ReusableMethods.bekle(3);


    }
}
