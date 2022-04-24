package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   WebDriver driver;

    @FindBy(css="a[href=\"/login?returnUrl=%2F\"]")
    WebElement loginBtn;

    @FindBy(id="Email")
    WebElement email;

    @FindBy(id="Password")
  public   WebElement password;

    @FindBy(xpath ="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
  public   WebElement logoutbtn;

    public LoginPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
public  void login(String mail, String pass)
{
    loginBtn.click();
    email.sendKeys(mail);
    password.sendKeys(pass);

}
}
