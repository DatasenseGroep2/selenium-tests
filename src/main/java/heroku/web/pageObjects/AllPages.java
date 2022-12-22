package heroku.web.pageObjects;

import heroku.web.utils.BrowserUtil;
import org.openqa.selenium.WebDriver;

public class AllPages {
    public LoginPage loginPage;
    public HomePage homePage;
    public RegisterPage registerPage;
    public SpelerPage spelerPage;
    public SpelersPage spelerspage;
    private WebDriver driver;

    public AllPages(){
        driver = BrowserUtil.createBrowser();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        spelerPage = new SpelerPage(driver);
        spelerspage = new SpelersPage(driver);
    }

    public void closeBrowser(){
        driver.quit();
    }
}
