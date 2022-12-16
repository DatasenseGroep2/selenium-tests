package heroku.web.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    private By usernameTxt = By.cssSelector("#username");
    private By passwordTxt = By.cssSelector("#password");
    private By loginBtn = By.cssSelector("button");
    private By errorMsg = By.cssSelector("#flash");
    public LoginPage(WebDriver driver) {
        super(driver, "login");
    }

    public void fillInUsername(String username){
        WebElement usernameTxtElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        usernameTxt
                ));
        usernameTxtElement.sendKeys(username);
    }

    public void fillInPassword(String password){
        WebElement passwordTxtElement = driver.findElement(passwordTxt);
        passwordTxtElement.sendKeys(password);
    }

    public void clickLogin(){
        WebElement loginBtnElement = driver.findElement(loginBtn);
        loginBtnElement.click();
    }

    public String getErrorMessage() {
        WebElement errorMsgElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        errorMsg
                ));
        return errorMsgElement.getText();
    }

    public void login(String username, String password){
        fillInUsername(username);
        fillInPassword(password);
        clickLogin();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}
