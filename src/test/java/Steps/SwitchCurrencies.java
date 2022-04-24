package Steps;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SwitchCurrencies {
    HomePage home;
    @When("user select Uro")
    public void user_select_uro() {
        home=new HomePage(Hooks.driver);
        home.selectUro();
    }


    @When("user select US Dollar")
    public void userSelectUSDollar() {
        home=new HomePage(Hooks.driver);
        home.selectDollar();
    }
}
