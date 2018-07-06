package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import support.BaseSteps;
import support.DriverQA;
import pages.HomePage;

public class Create_Account_Steps extends BaseSteps {

    DriverQA driver = new DriverQA();
    HomePage home = new HomePage();


    @Given("^User Access the My Store web page$")
    public void accessTheMyStoreWebPage() {
        String url = "http://automationpractice.com/index.php";
        driver.openURL(url);
    }

    @Given("^Users is in the Home of the Application$")
    public void usersIsInTheHomeOfTheApplication() {
        Assert.assertEquals("http://automationpractice.com/index.php", home.ReturnURL());
    }

    @When("^User clicks on Sig In option$")
    public void userClicksOnSigInOption(){
        home.clickBtnSignIn();
    }

    @Then("^User should see the \"([^\"]*)\" page$")
    public void userShouldSeeThePage(String string01) {

    }
}
