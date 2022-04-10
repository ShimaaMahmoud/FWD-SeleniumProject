package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateOrder {
    @When("user check shopping cart")
    public void user_check_shoppingCart() {
        Hooks.driver.findElement(By.id("topcartlink")).click();
        Hooks.driver.findElement(By.id("termsofservice")).click();
        Hooks.driver.findElement(By.id("checkout")).click();

        Select list = new Select(Hooks.driver.findElement(By.id("BillingNewAddress_CountryId")));
        list.selectByVisibleText("Egypt");
        Hooks.driver.findElement(By.id("BillingNewAddress_City")).sendKeys("cairo");
        Hooks.driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("shoubra");
        Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("15555");

        Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01111111118");
        Hooks.driver.findElement(By.name("save")).click();
        Hooks.driver.findElement(By.id("shippingoption_1")).click();
        Hooks.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        Hooks.driver.findElement(By.id("paymentmethod_0")).click();
        Hooks.driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
        Hooks.driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
        Hooks.driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();


    }

    @Then("order is created sucsessfully")
    public void orderIsCreatedSucsessfully() {
    String text= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText();
        Assert.assertTrue(text.contains("Your order has been successfully processed"));

    }
}
