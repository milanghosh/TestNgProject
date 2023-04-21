package ParallelTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallelTest1 {

    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver = WebDriverManager.chromedriver().create(); //.capabilities(co)
        driver.get("https://opensource-demo.orangehrmlive.com");  //https://opensource-demo.orangehrmlive.com
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test()
    void logoTest() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-branding']/img")));
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed");
        Thread.sleep(5000);
    }

    @Test()
    void homePageTittle() throws InterruptedException {
        driver.manage().window().maximize();
        String tittle = driver.getTitle();
        Assert.assertEquals("OrangeHRM",tittle, "Tittle not matched");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}

// To run methods in parallel
/*<suite name="All Test Suite" parallel="methods" thread-count="2">
<test name="test1">
<classes>
<class name="ParallelTests.ParallelTest1">
</class>
</classes>
</test>
</suite>*/
