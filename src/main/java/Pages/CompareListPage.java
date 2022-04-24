package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompareListPage {
    WebDriver driver;
    @FindBy(id = "product_attribute_9")
    WebElement size;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")
    WebElement list;
    @FindBy(xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[2]/button\n")
    WebElement x;
    @FindBy(id = "bar-notification")
   public WebElement bar1;
    public CompareListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addtocomparelist() throws InterruptedException {

        list.click();
        Select list1 = new Select(size);
        list1.selectByVisibleText("9");
        x.click();
        Thread.sleep(2000);
    }
}