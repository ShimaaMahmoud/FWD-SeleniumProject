package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelectDiffTags {

    @When("user select different tags")
    public void userSelectDifferentTags() {

    }

    @Given("user navigate to tags page")
    public void userNavigateToTagsPage() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/producttag/all");

    }

    @When("user select appearal tags")
    public void userSelectAppearalTags() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/ul/li[1]/a")).click();
    }

    @Then("user get results related to appearal")
    public void userGetResultsRelatedToAppearal() {
        String url= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("apparel"));
    }

    @When("user select book tag")
    public void userSelectBookTag() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/producttag/all");
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/ul/li[3]/a\n")).click();
    }

    @Then("user get results related to books")
    public void userGetResultsRelatedToBooks() {
        String url= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("book"));
    }
}
