import org.testng.annotations.Test;

public class GroupingTestCase {
   @Test(groups = {"Regression"})
    void TestCase1(){
        System.out.println("TestCase 1");
    }
    @Test(groups = {"Regression"})
    void TestCase2(){
        System.out.println("TestCase 2");
    }
    @Test(groups = {"Regression","Sanity"})
    void TestCase3() {
        System.out.println("Testcase 3");
    }
    @Test(groups = {"Smoke"})
    void TestCase4() {
        System.out.println("Testcase 4");
    }
    @Test(groups = {"Sanity"})
    void TestCase5() {
        System.out.println("Testcase 5");
    }
    @Test(groups = {"Sanity"})
    void TestCase6() {
         System.out.println("Testcase 6");
    }
}


