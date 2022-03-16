import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenBrowser {

    WebDriver browser =null;

    @Test
    public void validaData() throws InterruptedException {
        browser.navigate().to("https://the-internet.herokuapp.com/login");
        browser.findElement(By.id("username")).sendKeys("tomsmith");
        browser.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        browser.findElement(By.xpath("//button[@type=\"submit\"]")).click();
         Thread.sleep(3000);
         String expectedResult="You logged into a secure area!";
         String actualResult= browser.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
         int x=0;
    }

    @Test
    public void invalidaData() throws InterruptedException {

        browser.navigate().to("https://the-internet.herokuapp.com/login");
        browser.findElement(By.id("username")).sendKeys("tomsmith");
        browser.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        browser.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);

    }



    @BeforeTest
    public void beforeTest() throws InterruptedException {

        String chromePath =System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        browser=new ChromeDriver();
        browser.navigate().to("https://the-internet.herokuapp.com/login");
        browser.manage().window().maximize();
        Thread.sleep(3000);
    }



        
        
       

//
//
//        String text =browser.findElement(By.id("flash")).getText();
//         System.out.println(text);
//        //  browser.findElement(By.className("radius")).click();
//        // browser.findElement(By.linkText("Elemental Selenium")).click();
//      //  browser.close();

}
