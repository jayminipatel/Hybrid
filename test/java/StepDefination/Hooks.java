package StepDefination;

import CommanPages.BrowserSelector;
import CommanPages.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import javax.rmi.CORBA.Util;

import static CommanPages.BasePage.driver;

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser(){
        browserSelector.openSelectedBrowser();

    }
    @After
    public void closeBrowser(){
        driver.quit();

    }
}
