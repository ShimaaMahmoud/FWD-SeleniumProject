package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SwitchCurrencies {
    @When("user select Uro")
    public void user_select_uro() {
        Select list = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        list.selectByVisibleText("Euro");

    }


    @When("user select US Dollar")
    public void userSelectUSDollar() {
        Select list = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        list.selectByVisibleText("US Dollar");
    }
}
