package StepDefination;

import ResultVerification.ResultVerificationForHomePage;
import ResultVerification.ResultVerificationForLoginPage;
import WebElements.LoginPage;
import cucumber.api.java.en.When;

public class Login {
    LoginPage loginPage = new LoginPage();
    ResultVerificationForLoginPage resultVerificationForLoginPage = new ResultVerificationForLoginPage();
    ResultVerificationForHomePage resultVerificationForHomePage = new ResultVerificationForHomePage();

    @When("^User click on Login link$")
    public void user_click_on_Login_link()  {loginPage.clickOnLoginLink();
        System.out.println("Use click on Login");

    }

    @When("^User is on login page and verify the login page$")
    public void user_is_on_login_page_and_verify_the_login_page() {
        resultVerificationForLoginPage.loginPageTitle();
        System.out.println("User verify login page");

    }

    @When("^User enter valid username and valid password and click on login button$")
    public void user_enter_valid_username_and_valid_password_and_click_on_login_button()  {
        loginPage.doLogin();
        System.out.println("User enter login details");

    }

    @When("^User is on home page and verify the home page title$")
    public void user_is_on_home_page_and_verify_the_home_page_title()  {
        resultVerificationForHomePage.HomePageTitle();
        System.out.println("User Verify homepage");

    }



}
