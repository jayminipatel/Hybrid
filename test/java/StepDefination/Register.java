package StepDefination;

import WebElements.RegisterPage;
import cucumber.api.java.en.When;

public class Register {
    RegisterPage registerPage = new RegisterPage();
    @When("^User click on Register Link$")
    public void user_click_on_Register_Link() {
        registerPage.clickOnRegisterLink();
        System.out.println("User click on Register Page");


    }

    @When("^Enter Firstname and Lastname and Email and Password and ConfirmPassword$")
    public void enter_Firstname_and_Lastname_and_Email_and_Password_and_ConfirmPassword()  {
        registerPage.doRegister();
        System.out.println("User enter Register Details");

    }

    @When("^click on Register button$")
    public void click_on_Register_button()  {
        registerPage.clickOnRegisterButton();


    }
}
