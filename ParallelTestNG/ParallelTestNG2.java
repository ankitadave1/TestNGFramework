package ParallelTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTestNG2 {
    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetal\\IdeaProjects\\JavaLearning\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("abc123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Login");
        Thread.sleep(5000);
    }
    @AfterMethod
    void CloseBrowser(){
        driver.quit();
    }
}

