package Com.StepDefination;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverClass {

    static WebDriver driver;

    public void openBrowser() {
        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();
    }

    public void closeBrowser(){

        driver.close();
    }


}
