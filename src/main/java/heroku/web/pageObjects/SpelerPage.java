package heroku.web.pageObjects;

import org.openqa.selenium.WebDriver;

public class SpelerPage extends BasePage{
    public SpelerPage(WebDriver driver) {
        super(driver, "player");
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
