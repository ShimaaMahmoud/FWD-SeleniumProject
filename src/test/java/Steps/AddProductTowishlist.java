package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddProductTowishlist {
    @When("user click on Add to wishlist")
    public void user_add_product_to_wishlist() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
        Select list = new Select(Hooks.driver.findElement(By.id("product_attribute_9")));
        list.selectByVisibleText("9");
        Hooks.driver.findElement(By.id("add-to-wishlist-button-25")).click();
    }

    @Then("product added sucsessfully to wishlist")
    public void productAddedSucsessfullyToWishlist() {
        Assert.assertTrue( Hooks.driver.findElement(By.className("bar-notification")).getText().contains("wishlist"));
    }
}

