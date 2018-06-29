package pages;

import sun.font.TrueTypeFont;
import support.DriverQA;

public class HomeSiga {

    private DriverQA driver;

    public HomeSiga(DriverQA stepDriver){
        driver = stepDriver;
    }

    public String homeAcess(){
        return driver.getCurrentURL();
    }

    public String checkName(){
        return driver.getText("span_vPRO_PESSOALNOME");
    }

    public String checkEmail(){
        return driver.getText("span_vPRO_PESSOALEMAIL");
    }

    public String checkCPF(){
        return driver.getText("span_vPRO_PESSOALDOCSCPF");
    }

    public String checkBirth(){
        return driver.getText("span_vPRO_PESSOALDATANASCIMENTO");
    }
}
