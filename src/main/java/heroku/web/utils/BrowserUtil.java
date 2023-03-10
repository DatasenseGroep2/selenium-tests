package heroku.web.utils;

import heroku.common.JSONHelper;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserUtil {

    public static WebDriver createBrowser(){
        return createBrowser(WebConfig.getDefaultBrowser());
    }

    public static WebDriver createBrowser(String browserType){
        WebDriver driver;
        switch (browserType){
            case "chrome":
                ChromeDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                FirefoxDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Unsupported browser");
        }
        driver.manage().window().maximize();
        return driver;
    }
}
