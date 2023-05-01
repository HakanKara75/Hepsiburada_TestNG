package hepsiburada.tests.day01;

import hepsiburada.pages.Hepsiburada;
import hepsiburada.utilities.ConfigReader;
import hepsiburada.utilities.Driver;
import hepsiburada.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C01_Hepsiburada_Login {

    @Test
    public void loginTest() {
        // "https://www.hepsiburada.com/" adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada_Url"));


        //login yap
        Hepsiburada hepsiburada=new Hepsiburada();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hepsiburada.giris).perform();
        ReusableMethods.bekle(3);
        hepsiburada.login.click();
        ReusableMethods.bekle(3);

        hepsiburada.emailGir.click();
        hepsiburada.emailGir.sendKeys(ConfigReader.getProperty("hepsiburada_Email" ),Keys.TAB);
        hepsiburada.girisYap.click();





        Driver.closeDriver();

    }
}
