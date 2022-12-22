package heroku.web.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SpelersPage extends BasePage{
    private final By clubImage = By.cssSelector("img:nth-child(2)");
    private By AanvallerCheckBox;
    private By MiddenvelderCheckBox;
    private By VerdedigerCheckBox;
    private By KeeperCheckBox;
    private WebElement SpelerLastNameText;
    private WebElement SpelersFirstName;
    private WebElement SpelersPositionText;
    private WebElement SpelerStrongFootText;
    private By matchSelector = By.xpath("//*[@id=\"left-side-content\"]/mat-form-field/div/div[1]");
    private By firstMatchOption = By.xpath("//*[@id=\"mat-option-0\"]/span");
    private By secondMatchOption = By.xpath("//*[@id=\"mat-option-1\"]/span");
    private By thirdMatchOption = By.xpath("//*[@id=\"mat-option-2\"]/span");
    private By fourthMatchOption = By.xpath("//*[@id=\"mat-option-3\"]/span");
    private By fifthMatchOption = By.xpath("//*[@id=\"mat-option-4\"]/span");
    private By matchInfoText = By.xpath("//*[@id=\"left-side-content\"]/p");

    public SpelersPage(WebDriver driver) {
        super(driver, "players");
    }

    public boolean ImageIsvisible(){
        WebElement imageWebElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        clubImage
                ));
        return imageWebElement.toString().contains("img");
    }

    public void ClickAanvallerCheckBox(){
        WebElement AanvallerWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        AanvallerCheckBox
                )
        );
        AanvallerWebElement.click();
    }

    public void ClickMiddenvelderCheckBox() {
        WebElement MiddenvelderWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        MiddenvelderCheckBox
                )
        );
        MiddenvelderWebElement.click();
    }

    public void ClickVerdedigerCheckBox() {
        WebElement VerdedigerWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        VerdedigerCheckBox
                )
        );
        VerdedigerWebElement.click();
    }

    public void ClickKeeperCheckBox() {
        WebElement KeeperWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        KeeperCheckBox
                )
        );
        KeeperWebElement.click();
    }

   public void navigateToDetailPagePlayer() throws InterruptedException {
        Thread.sleep(1000);
       WebElement spelerVoornaamTextBox = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-players/table/tbody/tr[1]/td[1]"));
        WebElement voornaamSpelersWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        spelerVoornaamTextBox
                )
        );
        voornaamSpelersWebElement.click();
    }

    public String getSpelersFirstName() throws InterruptedException {
        Thread.sleep(1000);
        SpelersFirstName = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-players/table/tbody/tr[1]/td[1]"));
        WebElement voornaamSpelersWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        SpelersFirstName
                )
        );
        return voornaamSpelersWebElement.getText();
    }

    public String getSpelersLastName() throws InterruptedException {
        Thread.sleep(1000);
         SpelerLastNameText = driver.findElement(By.xpath("//*[@id=\"left-side-content\"]/mat-list/mat-list-item[2]/span/span[4]"));
        WebElement voornaamSpelersWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        SpelerLastNameText
                )
        );
        return voornaamSpelersWebElement.getText();

    }

    public String getPlayerPosition() throws InterruptedException {
        Thread.sleep(1000);
        SpelersPositionText = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-players/table/tbody/tr[1]/td[4]"));
        WebElement positionSpelersWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        SpelersPositionText
                )
        );
        return positionSpelersWebElement.getText();
    }

    public String getPlayerStrongFoot() throws InterruptedException {
        Thread.sleep(1000);
        SpelerStrongFootText = driver.findElement(By.xpath("//*[@id=\"left-side-content\"]/mat-list/mat-list-item[10]/span/span[4]"));
        WebElement strongfootSpelersWebElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        SpelerStrongFootText
                )
        );
        return strongfootSpelersWebElement.getText();
    }

    public void ClickMatchSelector(){
        WebElement matchesElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        matchSelector
                ));
        matchesElement.click();
    }

    public void ClickFirstMatchOption(){
        ClickMatchSelector();
        WebElement firstMatchElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        firstMatchOption
                ));
        firstMatchElement.click();
    }

    public void ClickSecondMatchOption() throws InterruptedException {
        ClickMatchSelector();
        Thread.sleep(1000);
        WebElement secondMatchElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        secondMatchOption
                ));
        secondMatchElement.click();
    }

    public void ClickThirdMatchOption() throws InterruptedException {
        ClickMatchSelector();
        Thread.sleep(1000);
        WebElement thirdMatchElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        thirdMatchOption
                ));
        thirdMatchElement.click();
    }

    public void ClickFourthMatchOption() throws InterruptedException {
        ClickMatchSelector();
        Thread.sleep(1000);
        WebElement fourthMatchElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        fourthMatchOption
                ));
        fourthMatchElement.click();
    }

    public void ClickFifthMatchOption() throws InterruptedException {
        ClickMatchSelector();
        Thread.sleep(1000);
        WebElement fifthMatchElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        fifthMatchOption
                ));
        fifthMatchElement.click();
    }

    public String printMatchInfo() throws InterruptedException {
        Thread.sleep(1000);
        WebElement matchInfoElement = driver.findElement(matchInfoText);
        return matchInfoElement.getText();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }


}
