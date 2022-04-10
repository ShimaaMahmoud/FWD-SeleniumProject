package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FilterByColor {
    WebElement checkBox;
    @When("user select specific color")
    public void user_select_specific_color() {
        checkBox= Hooks.driver.findElement(By.xpath("//*[@id=\"attribute-option-14\"]"));
        checkBox.click();

    }

    @Then("element is checked")
    public void elementIsChecked() {
        Assert.assertTrue(checkBox.isSelected());
    }
}
