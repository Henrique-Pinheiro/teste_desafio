package pages;

import com.github.javafaker.Faker;
import support.DriverQA;

import java.util.Random;

public class CreateAccPage {

    Faker faker = new Faker();
    DriverQA driver = new DriverQA();
    Random random;//random.nextBoolean();

    public String checkHeadCreateAcc() {
        driver.waitElement("customer_firstname");
        return driver.getText("page-heading", "class");
    }

    public void fillFilds(){

        //setting variable with random Data, to fill the fields.
        String txtFirstName = faker.name().firstName();
        String txtLastName = faker.name().lastName();
        String txtPassword = txtFirstName+"123";
        String txtCompany = faker.company().industry();
        String txtAddress = faker.address().fullAddress();
        String txtAddress2 = faker.address().secondaryAddress();
        String txtCity = faker.address().city();
        String txtZipCode = faker.address().zipCode();
        String txtaddInfo = faker.lorem().sentence();
        String txtHomePhone = faker.phoneNumber().phoneNumber();
        String txtMobilePhone = faker.phoneNumber().cellPhone();
        String txtAddressAlias = "My Address";
        //Filling the fields
        driver.sendKeys(txtFirstName, "customer_firstname");
        driver.sendKeys(txtLastName, "customer_lastname");
        driver.sendKeys(txtPassword,"passwd");
        driver.sendKeys(txtFirstName, "firstname");
        driver.sendKeys(txtLastName, "lastname");
        driver.sendKeys(txtCompany, "company");
        driver.sendKeys(txtAddress, "address1");
        driver.sendKeys(txtAddress2, "address2");
        driver.sendKeys(txtCity, "city");
        driver.sendKeys(txtZipCode, "postcode");
        driver.sendKeys(txtaddInfo, "other");
        driver.sendKeys(txtHomePhone, "phone");
        driver.sendKeys(txtMobilePhone, "phone_mobile");
        driver.sendKeys(txtAddressAlias, "alias");
        //Selecting random Radio Button
        //if (random.nextBoolean()) {
            driver.click("id_gender1");
       // } else driver.click("id_gender2");
        driver.waitElement("asdfasdsa");
    }
}
