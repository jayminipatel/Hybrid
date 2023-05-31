package ResultVerification;


import CommanPages.Utils;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;

public class ResultVerificationForLoginPage extends Utils {
    public void loginPageTitle(){
   String LoginPageTitle    = driver.getTitle();
   Assert.assertEquals(LoginPageTitle,"nopCommerce demo store. Login","Login page title not matched");

    }



}
