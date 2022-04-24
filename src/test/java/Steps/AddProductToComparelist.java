package Steps;

import Pages.CompareListPage;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToComparelist {
    CompareListPage compareListPage;
    @When("user click on Add to comparelist")
    public void user_add_product_to_comparelist() throws InterruptedException {
        compareListPage=new CompareListPage(Hooks.driver);
        compareListPage.addtocomparelist();
        Assert.assertTrue( compareListPage.bar1.getText().contains("comparison"));
    }
}
