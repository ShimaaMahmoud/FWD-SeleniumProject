package Steps;

import Pages.ColorFlitrationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FilterByColor {
    WebElement checkBox;
    ColorFlitrationPage colorFlitrationPage;
    @When("user select specific color")
    public void user_select_specific_color() {
        colorFlitrationPage=new ColorFlitrationPage(Hooks.driver);
        colorFlitrationPage.filterbycolor();
    }

    @Then("element is checked")
    public void elementIsChecked() {
        colorFlitrationPage=new ColorFlitrationPage(Hooks.driver);

        Assert.assertTrue(colorFlitrationPage.checkbox.isSelected());
    }
}
