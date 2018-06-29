package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import support.BaseSteps;
import support.DriverQA;

public class Create_Account_Steps extends BaseSteps {

    @Given("^User Access the My Store web page$")
    public void accessTheMyStoreWebPage() {
        DriverQA driver = new DriverQA();
        String url = "http://automationpractice.com/index.php";
        driver.openURL(url);
    }
}
