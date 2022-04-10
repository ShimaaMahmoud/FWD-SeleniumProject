package Steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login {
    Faker f=new Faker();
    int mail=f.random().nextInt(100);
    int x=mail;

    @Given("user go to login page")
    public void user_go_to_login_page() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();


    }
    @When("user login with valid user and password")
    public void user_login_with_valid_user_and_password() {
        Hooks.driver.findElement(By.id("Email")).sendKeys(mail+"@gmail.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
    }
    @When("user press on login button")
    public void user_press_on_login_button() throws InterruptedException {
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
        Thread.sleep(6000);
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {

    }

    @When("there is registered user")
    public void thereIsRegisteredUser() {
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();

        Hooks.driver.findElement(By.id("gender-male")).click();
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("shimaa");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("taha");
        Hooks.driver.findElement(By.id("Email")).sendKeys(mail+"@gmail.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(By.id("register-button")).submit();
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
    }
}
