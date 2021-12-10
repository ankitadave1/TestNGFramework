import org.testng.annotations.Test;

public class SecondTestNGTestCase {

    @Test(priority = 1)
    void openBrowser(){

        System.out.println("User able to open browser");
    }
    @Test(priority = 2)
    void addProduct(){

        System.out.println("User able to add product");
    }
    @Test(priority = 3)
    void buyProduct(){

        System.out.println("User able to buy product");
    }
    @Test(priority = 4)
    void closeBrowser(){
        System.out.println("User able to close browser");
    }
}
