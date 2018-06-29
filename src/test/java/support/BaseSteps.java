package support;

import support.DriverQA;

public class BaseSteps {

    protected static DriverQA driver = new DriverQA();

    public BaseSteps(){
        driver.start("chrome");
    }

}
