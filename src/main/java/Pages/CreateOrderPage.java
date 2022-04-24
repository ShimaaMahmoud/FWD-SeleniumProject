package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOrderPage {
    WebDriver driver;
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
    WebElement item;
    @FindBy(id ="topcartlink")
    WebElement cartlink;

    @FindBy(id ="topcartlink")
    WebElement services;

    @FindBy(id ="termsofservice")
    WebElement tofservice;

    @FindBy(id ="checkout")
    WebElement checkout;

    @FindBy(id ="BillingNewAddress_CountryId")
    WebElement address;

    @FindBy(id ="BillingNewAddress_City")
    WebElement addresscity;

    @FindBy(id="BillingNewAddress_Address1")
    WebElement address2;

    @FindBy (id="BillingNewAddress_ZipPostalCode")
    WebElement postal1;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement phone1;

    @FindBy(name = "save")
    WebElement saveBtn;

    @FindBy(id="shippingoption_1")
    WebElement shippingoption;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    WebElement shippingmethod;
    @FindBy(id="paymentmethod_0")
    WebElement paymethod;

    @FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/button")
    WebElement Btn1;

    @FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/button")
    WebElement Btn2;

    @FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/button")
    WebElement Btn3;

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
  public   WebElement text;

    public CreateOrderPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void createorder(String add,String city , String add2,String postal,String phone)
    {
        cartlink.click();
        services.click();
        tofservice.click();
        checkout.click();
        Select list = new Select(address);
        list.selectByVisibleText(add);
        addresscity.sendKeys(city);
        address2.sendKeys(add2);
        postal1.sendKeys(postal);
        phone1.sendKeys(phone);
        saveBtn.click();
        shippingoption.click();
        shippingmethod.click();
        paymethod.click();
        Btn1.click();
        Btn2.click();
        Btn3.click();
    }
}
