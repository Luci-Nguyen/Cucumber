package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("user is login page")
    public void user_is_login_page() {
        System.out.println("user login page");
    }
    @When("user input username and password")
    public void user_input_username_and_password() {
        System.out.println("user input username and password");
    }
    @When("click to button login")
    public void click_to_button_login() {
        System.out.println("click to button login");
    }
    @Then("user is navigate homepage")
    public void user_is_navigate_homepage() {
        System.out.println("user is navigate homepage");
    }
}
