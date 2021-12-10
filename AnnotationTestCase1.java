import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AnnotationTestCase1 {

    WebDriver driver;

    @Test
    void testCase1() throws InterruptedException {
        System.out.println("Test Case 1");
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("aadi143@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("abc123");
        //driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }
    @Test
    void testCase2() throws InterruptedException {
        System.out.println("Test Case 2");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }
    @BeforeMethod
    void BeforeMethod(){
        System.out.println("Execute before method");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hetal\\IdeaProjects\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @AfterMethod
    void AfterMethod(){
        System.out.println("Execute after method");
        driver.quit();
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Execute Before class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("Execute After class");
    }

    @BeforeTest
    void beforeTests(){
        System.out.println("Execute Before Tests");
    }
    @AfterTest
    void afterTests(){
        System.out.println("Execute After Tests");
    }

}
