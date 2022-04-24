package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagsPage {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/ul/li[1]/a")
    WebElement tag1;

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/ul/li[3]/a\n")
    WebElement tag2;
    public TagsPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void selectTag1()
    {
        tag1.click();
    }
    public void selectTag2()
    {
        tag2.click();
    }
}
