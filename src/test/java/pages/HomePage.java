package pages;

import support.DriverQA;

public class HomePage {

    DriverQA driver = new DriverQA();

    public String ReturnURL () {
        return driver.getCurrentURL();
    }

    public void clickBtnSignIn (){
        driver.click("login", "class");
    }

}
