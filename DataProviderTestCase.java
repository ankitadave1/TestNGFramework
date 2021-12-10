import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestCase {

@Test(dataProvider = "loginTest",dataProviderClass = CustomDataProvider.class)
public void loginTest(String email,String pwd){
     System.out.println(email + " " + pwd);



   }
}



