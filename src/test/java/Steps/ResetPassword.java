package Steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ResetPassword {
    Login login=new Login();
    Faker f=new Faker();
    int mail=f.random().nextInt(100);
    @Given("user go to reset password page")
    public void user_go_to_reset_password_page() {
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();

        Hooks.driver.findElement(By.id("gender-male")).click();
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("shimaa");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("taha");
        Hooks.driver.findElement(By.id("Email")).sendKeys(mail+"@gmail.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("password1");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("password1");
        Hooks.driver.findElement(By.id("register-button")).submit();

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
    }

    @When("user enter valid mail")
    public void user_enter_valid_mail() {


  Hooks.driver.findElement(By.id("Email")).sendKeys(mail+"@gmail.com");
    }

    @Then("user can reset password sucsessfully")
    public void userCanResetPasswordSucsessfully() {
        Hooks.driver.findElement(By.name("send-email")).click();
     String text=   Hooks.driver.findElement(By.className("content")).getText();
        Assert.assertTrue(text.contains("Email with instructions has been sent to you."));

    }
}
