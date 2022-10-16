package AhlanUjianTiga.pages;

import AhlanUjianTiga.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebTables {
    private WebDriver driver;
    private String JavascriptExecutor;

    public WebTables() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    //klik button dismiss
    @FindBy(className = "woocommerce-store-notice__dismiss-link")
    WebElement btnDismis;
    //klik button My Account
    @FindBy(partialLinkText = "My Account")
    WebElement linkMyAcc;
    //untuk scrol
    public JavascriptExecutor getJs() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)");
        return js;
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

    @FindBy(id = "user_login")
    WebElement userlogin;

    @FindBy(id = "user_pass")
    WebElement password;

    @FindBy(id = "wp-submit")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/h3/a")
    WebElement openProduct;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement selectMenu;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement selectSize;

    @FindBy(xpath = "//*[@id=\"product-1491\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addCart;

    //Page Object
        public void registerForm() {
            btnDismis.click();
            linkMyAcc.click();
            //getJs().executeScript(JavascriptExecutor);

        //ini untuk register dan login
        reg_username.sendKeys("Sutankayo");
        delay(1);
        reg_email.sendKeys("sutankayo12345@gmail.com");
        delay(1);
        reg_password.sendKeys("Coba@t3stJuaraCoding1");
        delay(1);
        showPassword.click();
        delay(1);
        hidePassword.click();
        delay(1);
        register.click();
        userlogin.sendKeys("Sutankayo");
        delay(1);
        password.sendKeys("Coba@t3stJuaraCoding1");

        delay(1);
        login.click();

        driver.get("https://shop.demoqa.com");
        System.out.println("Add Card");

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1100)");
        delay(1);

        //buka product
        openProduct.click();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,600)");
        delay(1);

         //Select Warna
        Select pa_color = new Select(selectMenu);
        pa_color.selectByIndex(1);
        pa_color.selectByVisibleText("Grey");

        //Select Ukuran
        Select pa_size = new Select(selectSize);
        pa_size.selectByIndex(1);
        pa_size.selectByVisibleText("40");

        //add cart
        addCart.click();
 }
    static void delay ( int detik){
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

