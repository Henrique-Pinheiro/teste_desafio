package pages;

import com.github.javafaker.Faker;
import support.DriverQA;
import pages.CreateAccPage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthenticationPage {

    Faker faker = new Faker();
    DriverQA driver = new DriverQA();
    CreateAccPage createAcc = new CreateAccPage();

    private String txtEmail = faker.internet().emailAddress();
    private String txtPassword = createAcc.returnPassword();

    public String checkHeadAuthentication() {
        return driver.getText("page-heading", "class");
    }

    public void fillEmailAut() throws FileNotFoundException, UnsupportedEncodingException {
        driver.sendKeys(txtEmail, "email_create");
        //Saving the email for Login
        PrintWriter writer = new PrintWriter("Saved_Email.txt", "UTF-8");
        writer.println(txtEmail);
        writer.close();
    }

    public void clickCreateAcc(){
        driver.click("SubmitCreate");
    }
}
