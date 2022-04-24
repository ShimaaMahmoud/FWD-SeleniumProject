package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WishListPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")
    WebElement addproduct;


    @FindBy(id = "product_attribute_9")
    WebElement size;

    @FindBy(id = "add-to-wishlist-button-25")
    WebElement add;

    @FindBy(className = "bar-notification")
    public WebElement bar;

    public WishListPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void addtowishlist()
    {
        addproduct.click();
        Select list = new Select(size);
        list.selectByVisibleText("9");
        add.click();
    }
}
