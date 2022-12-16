package heroku.web.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    private By navBar = By.cssSelector(".mat-icon");
    private By logoutBtn = By.cssSelector(".icon-signout");
    private By homeLinkButton = By.linkText("Home");
    private By spelersLinkButton = By.linkText("Spelers");
    private By registerLinkButton = By.linkText("Registratie");

    private By clubImage = By.cssSelector("img:nth-child(2)");
    public HomePage(WebDriver driver) {
        super(driver, "home");
    }

    public void clickNavBar(){
        WebElement navBarElement = driver.findElement(navBar);
        navBarElement.click();
    }

    public void navToHome(){
        clickNavBar();
        WebElement HomeLinkElement =wait.until(
                ExpectedConditions.elementToBeClickable(
                        homeLinkButton
                ));
        HomeLinkElement.click();
    }

    public void navToSpelers(){
        clickNavBar();
        WebElement SpelersLinkElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        spelersLinkButton
                ));
        SpelersLinkElement.click();
    }

    public void navToRegister(){
        clickNavBar();
        WebElement RegisterLinkElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        registerLinkButton
                ));
        RegisterLinkElement.click();
    }

    public boolean ImageIsvisible(){
        WebElement imageWebElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        clubImage
                ));
        return imageWebElement.toString().contains("img");
    }

    public void logout() {
        WebElement logoutBtnElement = driver.findElement(logoutBtn);
        logoutBtnElement.click();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
