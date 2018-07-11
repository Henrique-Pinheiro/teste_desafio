package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import support.BaseSteps;
import support.DriverQA;
import pages.HomePage;
import pages.AuthenticationPage;
import pages.CreateAccPage;

public class Create_Account_Steps extends BaseSteps {

    DriverQA driver = new DriverQA();
    HomePage home = new HomePage();
    AuthenticationPage aut = new AuthenticationPage();
    CreateAccPage createAcc = new CreateAccPage();


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
        switch (string01) {
            case "AUTHENTICATION":
                Assert.assertEquals(string01, aut.checkHeadAuthentication());
            case "CREATE AN ACCOUNT":
                Assert.assertEquals(string01, createAcc.checkHeadCreateAcc());
            case "MY ACCOUNT":

        }

    }

    @Given("^User is at the \"([^\"]*)\" page$")
    public void userIsAtThePage(String string02){
        userClicksOnSigInOption();
        userShouldSeeThePage(string02);
    }

    @When("^User informs an email Address at the Create an account Option$")
    public void userInformsAnEmailAddressAtTheCreateAnAccountOption(){
        aut.fillEmailAut();
    }

    @And("^User clicks on the Create Account button$")
    public void userClicksOnTheCreateAccountButton(){
        aut.clickCreateAcc();
    }
}
