package Steps;

import Pages.RegisterPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Register {
    //WebDriver driver;
   // String text;

    Faker f=new Faker();
   int mail=f.random().nextInt(100);
    RegisterPage registerPage;
    String sucsessTextmsg;


    @When("user enter valida data")
    public void user_enter_valida_data() {
        registerPage=new RegisterPage(Hooks.driver);
       sucsessTextmsg= registerPage.register
          ("shimaa","taha",mail+"@gmail.com","password1","password1");

    }
    @Then("user can register sucsessfully")
    public void user_can_register_sucsessfully() {
        Assert.assertTrue(sucsessTextmsg.contains("completed"));
    }

}
