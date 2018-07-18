package pages;

import com.github.javafaker.Faker;
import support.DriverQA;
import pages.CreateAccPage;

import java.io.*;
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

    public void fillEmailLogin() throws IOException {
        String txtEmail = driver.fileToString("C:\\Users\\hers\\Desktop\\Selenium\\teste_desafio\\Saved_Email.txt");
        driver.sendKeys(txtEmail, "email");
    }

    public void fillPasswordLogin()throws IOException {
        String txtPassword = driver.fileToString("C:\\Users\\hers\\Desktop\\Selenium\\teste_desafio\\Saved_Password.txt");
        driver.sendKeys(txtPassword, "passwd");
    }

    public void clickSubmitLoginBtn() {
        driver.click("SubmitLogin");
    }
}