package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login {

    @Given("user go to login page")
    public void user_go_to_login_page() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();


    }
    @When("user login with valid user and password")
    public void user_login_with_valid_user_and_password() {
        Hooks.driver.findElement(By.id("Email")).sendKeys("validemail@example.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
    }
    @When("user press on login button")
    public void user_press_on_login_button() throws InterruptedException {
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {

    }
}
