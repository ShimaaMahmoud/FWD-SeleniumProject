package Steps;

import Pages.AddToCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddProductToCart {
    AddToCartPage addToCart;

    @When("user click on Add to cart")
    public void User_click_on_Add_to_cart() {

        addToCart=new AddToCartPage(Hooks.driver);
        addToCart.addtoCart();

    }

    @Then("product added sucsessfully to cart")
    public void productAddedSucsessfullyToCart() {
        String text=  Hooks.driver.findElement(By.className("content")).getText();
        Assert.assertTrue(text.contains("The product has been added to your shopping cart"));
    }
}

