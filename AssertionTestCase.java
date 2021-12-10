import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTestCase {
    WebDriver driver;

    @BeforeClass
    void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetal\\IdeaProjects\\JavaLearning\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test
    void webLogo() {
        WebElement Logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
        Assert.assertTrue(Logo.isDisplayed(), "Logo is not Displayed on the page");
    }

    @Test
    void homePageTitle() {

            String title = driver.getTitle();
            Assert.assertEquals("nopCommerce demo store", title, "Page title is not matched");
        }
        @AfterClass
        void closeBrowser(){

            driver.quit();


        }
    }

