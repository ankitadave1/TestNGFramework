import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestCase {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void openBrowser(String browser, String url) {

            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetal\\IdeaProjects\\Software\\chromedriver.exe");
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\hetal\\IdeaProjects\\Software\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.get(url);
    }
    @Test(priority = 1)
    void webLogoTest(){
        WebElement Logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        Assert.assertTrue(Logo.isDisplayed(),"Logo is not displayed");
    }
    @Test(priority = 2)
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("nopCommerce demo store",title,"Page title is not matched");
    }
    @AfterClass
    void closeBrowser(){
        driver.quit();
    }

}













































































