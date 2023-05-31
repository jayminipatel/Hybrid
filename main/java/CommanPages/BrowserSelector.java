package CommanPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage{
    // extends BasePage so get drivers and create object to call LoadProperty class
    LoadProperty loadProperty = new LoadProperty();// object to call LoadProperty class
    String browserName = loadProperty.getProperty("browser");
    String URL =loadProperty.getProperty("url");
    public void openSelectedBrowser() {
        //Open the local browser
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            System.out.println("No Browser available");

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(URL);
    }
}
