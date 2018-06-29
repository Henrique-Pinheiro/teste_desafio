package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomeSiga;
import pages.LoginSiga;
import support.BaseSteps;

public class LoginSigaSteps extends BaseSteps {

    private static LoginSiga login = new LoginSiga(driver);
    private static HomeSiga home = new HomeSiga(driver);


    @Given("^user would like to log in Siga application$")
    public void userwouldliketologinSigaapplication() {
        login.openSiga();
    }

    @Given("^user informs Usuário with value equal \"([^\"]*)\"$")
    public void userInformsUsuárioWithValueEqual(String value) throws Throwable {
        login.fillUsuario(value);
    }


    @And("^user informs Senha with value equal \"([^\"]*)\"$")
    public void userInformsSenhaWithValueEqual(String value) throws Throwable {
        login.fillSenha(value);
    }

    @When("^User clicks on Confirmar button$")
    public void userClicksOnConfirmarButton() throws Throwable {
        login.clickContinuar();
        Thread.sleep(3600);
    }

    @Then("^user should see fail message with \"([^\"]*)\"$")
    public void userShouldSeeFailMessageWith(String value) throws Throwable {
        Assert.assertEquals(value, login.checkMessage());
    }

    @Then("^user should see the Siga home page$")
    public void userShouldSeeTheSigaHomePage() throws Throwable {
        Assert.assertEquals("https://siga.cps.sp.gov.br/aluno/home.aspx", home.homeAcess());
        Thread.sleep(3600);
    }

    @And("^user should see his name with value equal \"([^\"]*)\"$")
    public void userShouldSeeHisNameWithValueEqual(String value) throws Throwable {
        Assert.assertEquals(value, home.checkName());
    }

    @And("^user should see his E-mail with value equal \"([^\"]*)\"$")
    public void userShouldSeeHisEMailWithValueEqual(String value) throws Throwable {
        Assert.assertEquals(value, home.checkEmail());
    }

    @And("^user should see his CPF with value equal \"([^\"]*)\"$")
    public void userShouldSeeHisCPFWithValueEqual(String value) throws Throwable {
        Assert.assertEquals(value, home.checkCPF());
    }

    @And("^user should see his born date with value equal \"([^\"]*)\"$")
    public void userShouldSeeHisBornDateWithValueEqual(String value) throws Throwable {
        Assert.assertEquals(value, home.checkBirth());
    }
}
