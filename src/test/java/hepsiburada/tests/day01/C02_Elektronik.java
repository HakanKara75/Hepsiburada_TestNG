package hepsiburada.tests.day01;

import hepsiburada.pages.Hepsiburada;
import hepsiburada.utilities.ConfigReader;
import hepsiburada.utilities.Driver;
import hepsiburada.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class C02_Elektronik {
    /* "https://www.hepsiburada.com/" adresine git
   cerezleri kabul et
   Elektronik ustune gel
    Bilgisayar/Tablet ustune gel

    */
    @Test
    public void testName() {
        // "https://www.hepsiburada.com/" adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada_Url"));

        //cerezleri kabul et
        Hepsiburada hepsiburada=new Hepsiburada();
        hepsiburada.cerezPolitikasiKabulButonu.click();
        ReusableMethods.bekle(2);

        //Elektronik ustune gel
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hepsiburada.elektronik).perform();
        ReusableMethods.bekle(2);

        //Bilgisayar/Tablet ustune gel
        actions.moveToElement(hepsiburada.bilgisayarTablet).perform();
        ReusableMethods.bekle(2);

        //Dizustu/ Bilgisayar tikla
        hepsiburada.dizustuBilgisayar.click();
        ReusableMethods.bekle(2);

        //soldaki menuden Apple sec
        actions.moveToElement(hepsiburada.appleCheckbox).perform();
        hepsiburada.appleCheckbox.click();
        ReusableMethods.bekle(2);

        //Sonuclarda Apple kelimesini dogrula
        List<WebElement> element= hepsiburada.appleUrunListesi.findElements(By.xpath("//h3[@data-test-id='product-card-name']"));
        for(WebElement elmnt: element){
            assertTrue(elmnt.getText().contains("Apple"));
        }

        //secim sonucu cikan urun sayisi ile goruntulenen urun sayisinin esit oldugunu dogrula
        int secimSonucu= Integer.parseInt(hepsiburada.fiyatSecimSonucu.getText());
        int size= element.size();
        System.out.println(size);
        System.out.println(secimSonucu);
        assertTrue(secimSonucu==size);

       //fiyat 18900-20800 sec
        hepsiburada.fiyat18_20Arasi.click();

        //secim sonucu cikan urun sayisi ile goruntulenen urun sayisinin esit oldugunu dogrula
        element= hepsiburada.appleUrunListesi.findElements(By.xpath("//h3[@data-test-id='product-card-name']"));
        size= element.size();
        secimSonucu= Integer.parseInt(hepsiburada.fiyatSecimSonucu.getText());


        assertTrue(secimSonucu==size);
















        //Bilgisayar/Tablet ustune gel
    }
}
