package pages;

import support.DriverQA;

public class MyAccountPage {

    DriverQA driver = new DriverQA();

    public String checkHeadMyAccount(){
        driver.waitElement("info-account", "class");
        return driver.getText("page-heading", "class");
    }
}