package pages;

import com.github.javafaker.Faker;
import support.DriverQA;

import java.util.Random;

public class CreateAccPage {

    Faker faker = new Faker();
    DriverQA driver = new DriverQA();


    public String checkHeadCreateAcc() {
        driver.waitElement("customer_firstname");
        return driver.getText("page-heading", "class");
    }

    public void fillFilds() {
        Random random = new Random();
        Boolean bolValue = random.nextBoolean();
        Boolean bolValue2 = random.nextBoolean();
        Boolean bolValue3 = random.nextBoolean();
        int intValue = random.nextInt((31 - 1) + 1);
        //setting variable with random Data, to fill the fields.
        String txtFirstName = faker.name().firstName();
        String txtLastName = faker.name().lastName();
        String txtPassword = txtFirstName + "123";
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
        driver.sendKeys(txtPassword, "passwd");
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
        if (bolValue) {
            driver.click("id_gender1");
        } else {
            driver.click("id_gender2");
        }
        //Selecting random checkbox's
        if (bolValue2) {
            driver.click("newsletter");}
        if (bolValue3) {
            driver.click("optin");
        }
        //Selecting random selects
        driver.click("uniform-days");
        driver.waitElement("xpath", "//*[@id=\"days\"]/option[2]" );
        //driver.click();
        //driver.waitElement("asdfasdsa");//tira e cola, rs
        }
    }

