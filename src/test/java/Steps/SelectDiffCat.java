package Steps;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SelectDiffCat {

Faker f=new Faker();
String mail=f.name().toString();
HomePage page;
    @Given("there is logged in user")
    public void there_is_logged_in_user() {
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();

        Hooks.driver.findElement(By.id("gender-male")).click();
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("shimaa");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("taha");
        Hooks.driver.findElement(By.id("Email")).sendKeys(mail+".com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("password11");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("password11");
        Hooks.driver.findElement(By.id("register-button")).submit();
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
        Hooks.driver.findElement(By.id("Email")).sendKeys(mail+".com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("password11");
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
    }
    @When("user select specific category")
    public void user_select_specific_category() {
   page=new HomePage(Hooks.driver);
   page.selectSubCat();
   System.out.println("woooooooooooooooooooooowww");
    }
    @Then("user find  the relative results")
    public void user_find_the_relative_results() {
        String url= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("shoes"));

    }


}
