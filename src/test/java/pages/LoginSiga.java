package pages;

import support.DriverQA;

public class LoginSiga {

    private DriverQA driver;

    public LoginSiga(DriverQA stepDriver){
        driver = stepDriver;
    }

    public  void clickContinuar(){
        driver.click("BTCONFIRMA","name");
    }

    public  void fillUsuario(String value) {
        driver.sendKeys(value, "vSIS_USUARIOID");
    }

    public  void fillSenha(String value) {
        driver.sendKeys(value, "vSIS_USUARIOSENHA");
    }

    public  void openSiga(){
        String url = "https://siga.cps.sp.gov.br/aluno/login.aspx?";
        driver.openURL(url);
    }

    public  String checkMessage() {
        return driver.getText("//*[@id=\"gxErrorViewer\"]/div", "xpath");
    }
}
