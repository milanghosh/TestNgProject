import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionExample {


    // To run testng xml from CLI : java -cp "path/to/testng.jar:path/to/your/test/classes" org.testng.TestNG testng.xml
    //         ChromeOptions co = new ChromeOptions();
//         co.setHeadless(true);
     WebDriver driver;
     @BeforeClass
     @Parameters({"browser","url"})
     void setup(String browser,String app){

         if(browser.equalsIgnoreCase("chrome")) {
             driver = WebDriverManager.chromedriver().create(); //.capabilities(co)
             driver.get(app);  //https://opensource-demo.orangehrmlive.com
             String url = driver.getCurrentUrl();
             System.out.println(url);
         }
         else if(browser.equalsIgnoreCase("firefox")){
             driver = WebDriverManager.firefoxdriver().create(); //.capabilities(co)
             driver.get(app);  //https://opensource-demo.orangehrmlive.com
             String url = driver.getCurrentUrl();
             System.out.println(url);
         }

     }

     @Test(priority = 1)
     void logoTest(){
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         WebDriverWait wait = new WebDriverWait(driver,5);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-branding']/img")));
         WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
         Assert.assertTrue(logo.isDisplayed(), "Logo not displayed");
     }

    @Test(priority = 2)
    void homePageTittle(){
         String tittle = driver.getTitle();
         Assert.assertEquals("OrangeHRM",tittle, "Tittle not matched");
    }

    @AfterClass
    void tearDown(){
         driver.quit();
    }

}
