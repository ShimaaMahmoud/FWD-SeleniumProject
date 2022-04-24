package Steps;

import Pages.LoginPage;
import Pages.RegisterPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login {
    Faker f=new Faker();
    int mail=f.random().nextInt(100);
    LoginPage loginPage;
    RegisterPage registerPage ;

    @Given("user go to login page")
    public void user_go_to_login_page() {
        loginPage=new LoginPage(Hooks.driver);
        loginPage.logoutbtn.click();
    }
    @When("user login with valid user and password")
    public void user_login_with_valid_user_and_password() {
        loginPage=new LoginPage(Hooks.driver);
        loginPage.login(mail+"@gmail.com","P@ssw0rd");


    }
    @When("user press on login button")
    public void user_press_on_login_button() throws InterruptedException {
        loginPage.password.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {

    }

    @When("there is registered user")
    public void thereIsRegisteredUser() {
        registerPage=new RegisterPage(Hooks.driver);
        registerPage.register
           ("shimaa","taha",mail+"@gmail.com","password1","password1");

    }
}
