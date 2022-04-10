package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ResetPassword {
    Login login=new Login();
    @Given("user go to reset password page")
    public void user_go_to_reset_password_page() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
    }

    @When("user enter valid mail")
    public void user_enter_valid_mail() {
  Hooks.driver.findElement(By.id("Email")).sendKeys(login.x+"@gmail.com");
    }

    @Then("user can reset password sucsessfully")
    public void userCanResetPasswordSucsessfully() {
        Hooks.driver.findElement(By.name("send-email")).click();
     String text=   Hooks.driver.findElement(By.className("content")).getText();
        Assert.assertTrue(text.contains("Email with instructions has been sent to you."));

    }
}
