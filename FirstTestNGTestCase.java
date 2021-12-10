import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNGTestCase {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser(){
        System.out.println("Browser will Open");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hetal\\IdeaProjects\\JavaLearning\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @Test(priority = 2)
    void logIn() throws InterruptedException {
        System.out.println("User able to login");
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("aadi456@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("aadi456");
        //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("aadi987");
        driver.findElement(By.cssSelector("button[class='button-1 login-button']")).click();
    }
    @Test(priority = 3)
    void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Browser will close");
        driver.quit();
    }
}
