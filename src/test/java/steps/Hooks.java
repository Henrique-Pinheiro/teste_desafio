package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.BaseSteps;

public class Hooks extends BaseSteps {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("--- Starting scenario " + scenario.getName() + " execution ---");
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("\n--- Scenario " + scenario.getName() + " executed ---");
        driver.quit();
    }
}
