package WebElements;

import CommanPages.LoadProperty;
import CommanPages.Utils;
import org.openqa.selenium.By;

public class LoginPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();

    private By _clickOnLoginLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    private By _emailId = By.id("Email");
    private By _passWord = By.id("Password");
    private By _clickOnLoginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public void clickOnLoginLink(){

        doClick(_clickOnLoginLink);
    }
    public void doLogin(){
        doSendKey(_emailId,loadProperty.getProperty("username"));
        doSendKey(_passWord,loadProperty.getProperty("password"));
        doClick(_clickOnLoginButton);

    }




}
