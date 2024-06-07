package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at home page")
    public void userAtHomePage() {
        loginPage.userAtHomePage();
    }

    @When("Click Login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }

    @When("write {string} for username field")
    public void writeForUsernameField(String username) {
        loginPage.writeUserNameForUserNameField(username);
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
    }

    @When("write correct {string} for username field")
    public void writeCorrectForUsernameField(String arg0) {
        loginPage.correctUsernameForUsernameField();
    }

    @When("write false {string} for password field")
    public void writeFalseForPasswordField(String arg0) {
        loginPage.falsePasswordForPasswordField();
    }

    @Then("Check {string} message about don't match")
    public void checkMessageAboutDonTMatch(String errorMsg) {
        loginPage.checkMessage(errorMsg);
    }

    @When("write false {string} for username field")
    public void writeFalseForUsernameField(String arg0) {
        loginPage.falseUsernameForUsernameField();
    }

    @When("write correct {string} for password field")
    public void writeCorrectForPasswordField(String arg0) {
        loginPage.correctPasswordForPasswordField();
    }
}
