package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
    @FindBy (id="FirstName")
    WebElement firstname;
    @FindBy (id="LastName")
    WebElement lastname;
    @FindBy (id="Email")
    WebElement email;
    @FindBy (id="Password")
    WebElement password;
    @FindBy (id="ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(id="register-button")
    WebElement submitRegisterBtn;
    @FindBy (id="gender-male")
    WebElement gender;
   @FindBy(css="a[class=\"ico-register\"]")
   WebElement registerBtn;
   @FindBy(css="div[class=\"result\"]")
   WebElement sucsessText;

public RegisterPage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver,this);
}

  public String register(String firstn,String lastn,String mail,String pass, String confirmpass)
  {
      registerBtn.click();
      gender.click();
      firstname.sendKeys(firstn);
      lastname.sendKeys(lastn);
      email.sendKeys(mail);
      password.sendKeys(pass);
      confirmPassword.sendKeys(confirmpass);
      submitRegisterBtn.click();
     return sucsessText.getText();
  }




}
