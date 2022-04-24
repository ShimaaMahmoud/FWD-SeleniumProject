package Steps;

import Pages.WishListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddProductTowishlist {
    @When("user click on Add to wishlist")
    public void user_add_product_to_wishlist() {
        WishListPage wishListPage =new WishListPage(Hooks.driver);
        wishListPage.addtowishlist();
    }

    @Then("product added sucsessfully to wishlist")
    public void productAddedSucsessfullyToWishlist() {
        WishListPage wishListPage =new WishListPage(Hooks.driver);
        Assert.assertTrue( wishListPage.bar.getText().contains("wishlist"));
    }
}

