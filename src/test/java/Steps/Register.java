package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Register {
    String text;
    @When("user enter valida data")
    public void user_enter_valida_data() {
Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
       Hooks.driver.findElement(By.id("gender-male")).click();
       Hooks.driver.findElement(By.id("FirstName")).sendKeys("shimaa");
       Hooks.driver.findElement(By.id("LastName")).sendKeys("taha");
       Hooks.driver.findElement(By.id("Email")).sendKeys("taha111@gmail.com");
       Hooks.driver.findElement(By.id("Password")).sendKeys("password1");
       Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("password1");
       Hooks.driver.findElement(By.id("register-button")).submit();
       text= Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
    }
    @Then("user can register sucsessfully")
    public void user_can_register_sucsessfully() {
        Assert.assertTrue(text.contains("completed"));
    }

}
