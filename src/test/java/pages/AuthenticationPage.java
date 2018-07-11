package pages;

import com.github.javafaker.Faker;
import support.DriverQA;

public class AuthenticationPage {

    Faker faker = new Faker();
    DriverQA driver = new DriverQA();

    public String checkHeadAuthentication() {
        return driver.getText("page-heading", "class");
    }

    public void fillEmailAut(){
        String email = faker.internet().emailAddress();
        driver.sendKeys(email, "email_create");
    }

    public void clickCreateAcc(){
        driver.click("SubmitCreate");
    }
}
