package WebElements;

import CommanPages.LoadProperty;
import CommanPages.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _clickOnRegisterLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    private By _FirstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _Email = By.id("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _clickOnRegisterButton = By.xpath("//*[@id=\"register-button\"]");

    public void clickOnRegisterLink(){
        doClick(_clickOnRegisterLink);

    }
    public void doRegister(){
        doSendKey(_FirstName,loadProperty.getProperty("FirstName"));
        doSendKey(_LastName,loadProperty.getProperty("LastName"));
        doSendKey(_Email,loadProperty.getProperty("Email"));
        doSendKey(_Password,loadProperty.getProperty("Password"));
        doSendKey(_ConfirmPassword,loadProperty.getProperty("ConfirmPassword"));

    }
    public void clickOnRegisterButton()
    { doClick(_clickOnRegisterButton);
    }






}
