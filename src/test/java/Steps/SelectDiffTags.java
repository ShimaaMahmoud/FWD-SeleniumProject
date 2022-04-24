package Steps;

import Pages.TagsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SelectDiffTags {

    TagsPage tagsPage;

    @When("user select different tags")
    public void userSelectDifferentTags() {

    }

    @Given("user navigate to tags page")
    public void userNavigateToTagsPage() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/producttag/all");

    }

    @When("user select appearal tags")
    public void userSelectAppearalTags() {
        tagsPage=new TagsPage(Hooks.driver);
        tagsPage.selectTag1();
    }

    @Then("user get results related to appearal")
    public void userGetResultsRelatedToAppearal() {
        String url= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("apparel"));
    }

    @When("user select book tag")
    public void userSelectBookTag() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/producttag/all");
        tagsPage=new TagsPage(Hooks.driver);
        tagsPage.selectTag2();
    }

    @Then("user get results related to books")
    public void userGetResultsRelatedToBooks() {
        String url= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("book"));
    }
}
