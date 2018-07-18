package pages;

import com.github.javafaker.Faker;
import support.DriverQA;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class CreateAccPage {

    Faker faker = new Faker();
    DriverQA driver = new DriverQA();

    //setting variable with random Data, to fill the fields.
    private Random random = new Random();
    private Boolean bolValue = random.nextBoolean();
    private Boolean bolValue2 = random.nextBoolean();
    private Boolean bolValue3 = random.nextBoolean();
    private int intValueDay = random.nextInt((28 - 1) + 1);
    private int intValueMonth = random.nextInt((11 - 1) + 1);
    private int intValueYear = random.nextInt((2018 - 1900) + 1);
    private int intValueState = random.nextInt((50 - 1) + 1);
    private String txtFirstName = faker.name().firstName();
    private String txtLastName = faker.name().lastName();
    private String txtPassword = txtFirstName + "123";
    private String txtCompany = faker.company().industry();
    private String txtAddress = faker.address().fullAddress();
    private String txtAddress2 = faker.address().secondaryAddress();
    private String txtCity = faker.address().city();
    private int intZipCode = random.nextInt((99999 - 10001) + 1);
    private String txtZipCode= Integer.toString(intZipCode);
    private String txtaddInfo = faker.lorem().sentence();
    private String txtHomePhone = faker.phoneNumber().phoneNumber();
    private String txtMobilePhone = faker.phoneNumber().cellPhone();
    private String txtAddressAlias = "My Address";

    public String checkHeadCreateAcc() {
        driver.waitElement("customer_firstname");
        return driver.getText("page-heading", "class");
    }

    public void fillFilds() throws FileNotFoundException, UnsupportedEncodingException {
        //removing masks
        txtHomePhone = txtHomePhone.replaceAll("\\D+","");
        txtMobilePhone = txtMobilePhone.replaceAll("\\D+","");
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
        driver.selectByIndex(intValueDay, "days");
        driver.selectByIndex(intValueMonth, "months");
        driver.selectByIndex(intValueYear, "years");
        driver.selectByIndex(intValueState, "id_state");
        //Saving the password for Login
        PrintWriter writer = new PrintWriter("Saved_Password.txt", "UTF-8");
        writer.println(txtPassword);
        writer.close();
    }

    public void clickBtnRegister(){
        driver.click("submitAccount");
    }

    public String returnPassword (){
        return txtPassword;
    }
}

