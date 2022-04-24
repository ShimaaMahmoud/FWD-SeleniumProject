package Steps;

import Pages.CreateOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateOrder {
    CreateOrderPage createOrderPage;
    @When("user check shopping cart")
    public void user_check_shoppingCart() {
        createOrderPage=new CreateOrderPage(Hooks.driver);
        createOrderPage.createorder("Egypt","cairo","shoubra","15555","01111111118");

    }

    @Then("order is created sucsessfully")
    public void orderIsCreatedSucsessfully() {
        createOrderPage=new CreateOrderPage(Hooks.driver);

        String text=createOrderPage.text.getText();
        Assert.assertTrue(text.contains("Your order has been successfully processed"));

    }
}
