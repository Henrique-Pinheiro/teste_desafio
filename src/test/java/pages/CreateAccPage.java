package pages;

import com.github.javafaker.Faker;
import support.DriverQA;

public class CreateAccPage {

    Faker faker = new Faker();
    DriverQA driver = new DriverQA();

    public String checkHeadCreateAcc() {
        return driver.getText("page-heading", "class");
    }
}
