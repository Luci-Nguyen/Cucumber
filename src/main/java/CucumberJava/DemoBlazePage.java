package CucumberJava;

import base.BasePage;
import constants.ConstantGlobal;
import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DemoBlazePage extends DriverManager {

    By btnLogin = By.id("login2");
    By inputUsername = By.id("loginusername");
    By inputPassword = By.id("loginpassword");
    By btnSubmitLogin = By.xpath("//button[@onclick='logIn()']");
    By verifyLogin = By.id("nameofuser");

    @Given("open demo blaze page url {string}")
    public void openDemoBlazePage(String url) {
        BasePage.openURL(url);
    }

    @And("click button login")
    public void clickButtonLogin() {
        BasePage.clickElement(btnLogin);
    }

    @When("input username {string} and password {string}")
    public void inputUsernameAndPassword(String username, String password) {
        BasePage.setText(inputUsername, username);
        BasePage.setText(inputPassword, password);
    }

    @Then("verify login")
    public void verifyLogin() {
        BasePage.sleep(5);
        String expect = BasePage.getText(verifyLogin);
        BasePage.verifyEquals(ConstantGlobal.VERIFY, expect);
    }

    @And("click button submit login")
    public void clickButtonSubmitLogin() {
        BasePage.clickElement(btnSubmitLogin);
    }


}
