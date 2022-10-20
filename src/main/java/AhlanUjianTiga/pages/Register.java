package AhlanUjianTiga.pages;

import AhlanUjianTiga.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    private WebDriver driver;
    private String JavascriptExecutor;

    public Register() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //isi username
    @FindBy(xpath = "//*[@id=\"reg_username\"]")
    WebElement reg_username;

    //isi email
    @FindBy(id = "reg_email")
    WebElement reg_email;

    //isi password
    @FindBy(id = "reg_password")
    WebElement reg_password;

    // klik show password
    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[3]/span/span")
    WebElement showPassword;

    // klik hide password
    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[3]/span/span")
    WebElement hidePassword;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
    WebElement register;

    public void register(String reg_username, String reg_email, String reg_password) {
        //ini untuk register dan login
        this.reg_username.sendKeys(reg_username);
        this.reg_email.sendKeys(reg_email);
        this.reg_password.sendKeys(reg_password);
        delay(1);
        showPassword.click();
        delay(1);
        hidePassword.click();
        delay(1);
        register.click();
    }
    static void delay ( int detik){
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}