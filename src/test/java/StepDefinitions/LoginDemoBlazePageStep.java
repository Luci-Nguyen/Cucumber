package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoBlazePageStep {
    static WebDriver driver;
    @Given("open browser")
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("open demo blaze page")
    public void openDemoBlazePage() {
        driver.navigate().to("https://www.demoblaze.com/");
    }

    @And("click login button")
    public void clickLoginButton() {

    }

    @Then("verify login")
    public void verifyLogin() {
    }

    @When("enter <username> and <password>")
    public void enterUsernameAndPassword() {

    }
}
