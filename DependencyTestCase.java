import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestCase {
    @Test
    void logIn()
    {
        System.out.println("User able to Login");
        Assert.fail(); //Fail the test case
    }
    @Test(dependsOnMethods = "logIn")
    void findProduct()
    {
        System.out.println("User able to Find Product");
    }
    @Test(dependsOnMethods = {"findProduct"},alwaysRun = true) //Force the method to execute
    void addProduct()
    {
        System.out.println("User able to Add Product");

    }
    @Test(dependsOnMethods = {"addProduct"},alwaysRun = true) //Force the method to execute
    void buyProduct()
    {
        System.out.println("User able to Buy Product");
    }

}


