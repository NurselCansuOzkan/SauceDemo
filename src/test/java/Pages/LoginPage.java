package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    static By loginButton = By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By usernameBox = By.cssSelector("#user-name");
    By password = By.cssSelector("#password");
    By producttext = By.cssSelector(".title");


    public void userAtHomePage() {
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton);
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUserNameForUserNameField(String username) {
        elementHelper.click(usernameBox);
        elementHelper.sendKey(usernameBox, "abcdef");
    }

    public void writePasswordForPasswordField(String pass) {
        elementHelper.click(password);
        elementHelper.sendKey(password, "123456");
    }

    public void correctUsernameForUsernameField() {
        elementHelper.click(usernameBox);
        elementHelper.sendKey(usernameBox, "standard_user");
    }

    public void falsePasswordForPasswordField() {
        elementHelper.click(password);
        elementHelper.sendKey(password,"abc1234");
    }

    public void falseUsernameForUsernameField() {
        elementHelper.click(usernameBox);
        elementHelper.sendKey(usernameBox, "abcdef");
    }

    public void correctPasswordForPasswordField() {
        elementHelper.click(password);
        elementHelper.sendKey(password, "secret_sauce");
    }

    public void checkSuccessful() {
        elementHelper.checkVisible(producttext);
    }
}
