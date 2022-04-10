package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddProductToCart {

    @When("user click on Add to cart")
    public void User_click_on_Add_to_cart() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]"))
                .click();
        Select list = new Select(Hooks.driver.findElement(By.id("product_attribute_9")));
        list.selectByVisibleText("9");
        Hooks.driver.findElement(By.id("add-to-cart-button-25")).click();
    }

    @Then("product added sucsessfully to cart")
    public void productAddedSucsessfullyToCart() {
        String text=  Hooks.driver.findElement(By.className("content")).getText();
        Assert.assertTrue(text.contains("The product has been added to your shopping cart"));
    }
}

