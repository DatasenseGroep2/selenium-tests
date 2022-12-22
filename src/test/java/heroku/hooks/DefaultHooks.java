package heroku.hooks;

import heroku.web.pageObjects.AllPages;
import org.testng.annotations.*;

public class DefaultHooks {
    protected AllPages pages;

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        pages = new AllPages();
        pages.loginPage.navigateTo();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown(){
        pages.closeBrowser();
    }
}
