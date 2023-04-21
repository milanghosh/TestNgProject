package ParallelTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {

    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver = WebDriverManager.chromedriver().create(); //.capabilities(co)
        driver.get("https://opensource-demo.orangehrmlive.com");  //https://opensource-demo.orangehrmlive.com
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test
    void loginTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("//input[@type=\"password\"]")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
