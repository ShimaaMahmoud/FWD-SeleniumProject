package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SearchProduct {


    @Given("user navigate to home page")
    public void user_navigate_to_home_page() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().window().maximize();

    }
    @When("user search on specific product")
    public void user_search_on_specific_product() {
      WebElement search= Hooks.driver.findElement(By.id("small-searchterms"));
             search .sendKeys("laptop");
             search.submit();



    }
    @Then("user find relative results")
    public void user_find_relative_results() {
        ArrayList pl = new ArrayList <String>();

        int count =Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] ")).size();
     for(int i=0;i<count;i++)
        {
            Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] ")).get(i).getText();
            pl.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] ")).get(i).getText());
            System.out.println(pl);
            Assert.assertTrue(pl.get(i).toString().contains("Laptop"));
        }

    }

}
