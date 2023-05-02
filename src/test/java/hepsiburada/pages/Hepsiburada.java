package hepsiburada.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import hepsiburada.utilities.Driver;

public class Hepsiburada {
    public Hepsiburada() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "myAccount")
    public WebElement giris;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cerezPolitikasiKabulButonu;
    @FindBy(id = "login")
    public WebElement login;
    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;
    @FindBy(id = "txtUserName")
    public WebElement emailGirKutusu;
    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement sifreGirKutusu;
    @FindBy(id = "btnLogin")
    public WebElement girisYap;
    @FindBy(id = "dropdown-basic-button")
    public WebElement verify;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement hataMesaji;
    @FindBy(xpath = "//div[text()='Bad credentials']")
    public WebElement hataMesaji2;
    @FindBy(id = "dropdown-basic-button")
    public WebElement logOut1;
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOut2;
    @FindBy(xpath = "//button[@class='ajs-button ajs-ok']")
    public WebElement ok;
    @FindBy(xpath = "(//li[@class='sf-MenuItems-WulWXvlfIAwNiOUGY7FP'])[1]")
    public WebElement elektronik;
    @FindBy(xpath = "(//a[@href='https://www.hepsiburada.com/bilgisayarlar-c-2147483646'])[1]")
    public WebElement bilgisayarTablet;

   // Dizustu Bilgisayar
    @FindBy(xpath = "(//a[@href='https://www.hepsiburada.com/laptop-notebook-dizustu-bilgisayarlar-c-98'])[1]")
    public WebElement dizustuBilgisayar;
    @FindBy(xpath = "//input[@value='apple']")
    public WebElement appleCheckbox;
    @FindBy(xpath = "//h3[@data-test-id='product-card-name']")
    public WebElement appleUrunListesi;
    @FindBy(xpath = "//h3[@data-test-id='product-card-name']")
    public WebElement fiyat18_20Arasi;
    @FindBy(xpath = "//span[@class='totalProductCount-NGwtj4MUJQB5Zmv2FajZ']")
    public WebElement fiyatSecimSonucu;
}
