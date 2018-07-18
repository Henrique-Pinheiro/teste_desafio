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
import pages.MyAccountPage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Create_Account_Steps extends BaseSteps {

    DriverQA driver = new DriverQA();
    HomePage home = new HomePage();
    AuthenticationPage aut = new AuthenticationPage();
    CreateAccPage createAcc = new CreateAccPage();
    MyAccountPage myaccount = new MyAccountPage();


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
                break;
            case "CREATE AN ACCOUNT":
                Assert.assertEquals(string01, createAcc.checkHeadCreateAcc());
                break;
            case "MY ACCOUNT":
                Assert.assertEquals(string01, myaccount.checkHeadMyAccount());
                break;
        }
    }

    @Given("^User is at the AUTHENTICATION page$")
    public void userIsAtThePage(){
        userClicksOnSigInOption();
        userShouldSeeThePage("AUTHENTICATION");
    }

    @When("^User informs an email Address at the Create an account Option$")
    public void userInformsAnEmailAddressAtTheCreateAnAccountOption() throws FileNotFoundException, UnsupportedEncodingException {
        aut.fillEmailAut();
    }

    @And("^User clicks on the Create Account button$")
    public void userClicksOnTheCreateAccountButton(){
        aut.clickCreateAcc();
    }

    @When("^User fill all the fields with random data$")
    public void userfillallthefieldswithrandomdata() throws FileNotFoundException, UnsupportedEncodingException {
        createAcc.fillFilds();
    }

    @And("^User clicks on the Register button$")
    public void userClicksOnTheRegisterButton(){
        createAcc.clickBtnRegister();
    }

    @When("^User informs an email address at the Already Registered Option$")
    public void userInformsAnEmailAddressAtTheAlreadyRegisteredOption() throws IOException {
        aut.fillEmailLogin();
    }

    @And("^User informs a Password$")
    public void userInformsAPassword() throws IOException {
        aut.fillPasswordLogin();
    }

    @And("^User Clicks on Sign in Button$")
    public void userClicksOnSignInButton(){
        aut.clickSubmitLoginBtn();
    }

    @Given("^User is at the MY ACCOUNT page$")
    public void userIsAtTheMYACCOUNTPage() throws IOException {
        userIsAtThePage();
        userInformsAnEmailAddressAtTheAlreadyRegisteredOption();
        userInformsAPassword();
        userClicksOnSignInButton();
        userShouldSeeThePage("MY ACCOUNT");
    }

    @When("^User clicks on Sign Out Button$")
    public void userClicksOnSignOutButton() {
        myaccount.clickSignOut();
    }

    //remove this
}
