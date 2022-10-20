package AhlanUjianTiga.pages;

import AhlanUjianTiga.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    private WebDriver driver;
    private String JavascriptExecutor;

    public Home() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //klik button dismiss
    @FindBy(className = "woocommerce-store-notice__dismiss-link")
    WebElement btnDismis;

    //klik button My Account
    @FindBy(partialLinkText = "My Account")
    WebElement linkMyAcc;

    public void home() {
        btnDismis.click();
        System.out.println("Dismis Clicked");
        delay(1);

        linkMyAcc.click();
        System.out.println("Button My Account Clicked");
        delay(1);
    }
    static void delay ( int detik){
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}