package heroku.web.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage{
    private By clubImage = By.cssSelector("img:nth-child(2)");
    public RegisterPage(WebDriver driver) {
        super(driver, "register");
    }

    public By getClubImage() {
        return clubImage;
    }

    public boolean ImageIsvisible(){
        WebElement imageWebElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        clubImage
                ));
        return imageWebElement.toString().contains("img");
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
