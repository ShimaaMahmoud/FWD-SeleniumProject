package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;
    @FindBy (id="customerCurrency")
    WebElement currency;
    @FindBy (xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    WebElement category;

    @FindBy (xpath = "html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a")
    WebElement subCategory;

    public HomePage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void selectUro()
    {
        Select list = new Select(currency);
        list.selectByVisibleText("Euro");
    }
    public void selectDollar()
    {
        Select list = new Select(currency);
        list.selectByVisibleText("US Dollar");

    }

    public void selectSubCat()
    {
        Actions action = new Actions(driver);
        action.moveToElement(category ).moveToElement(
                subCategory).click().
                build().perform();
    }
}
