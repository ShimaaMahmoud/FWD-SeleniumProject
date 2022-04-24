package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage {


    WebDriver driver;

    @FindBy(id="product_attribute_9")
    WebElement size;
    @FindBy(id="add-to-cart-button-25")
    WebElement Add;

    @FindBy (xpath ="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
    WebElement item;


    public AddToCartPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void addtoCart()
    {

        item.click();
        Select list = new Select(size);
        list.selectByVisibleText("9");
        list.selectByVisibleText("9");
        Add.click();

    }
}
