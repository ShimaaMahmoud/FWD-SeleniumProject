package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColorFlitrationPage {
    @FindBy(xpath ="//*[@id=\"attribute-option-14\"]")
  public   WebElement checkbox;
    WebDriver driver;

    public ColorFlitrationPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void filterbycolor()
    {
        checkbox.click();
}}
