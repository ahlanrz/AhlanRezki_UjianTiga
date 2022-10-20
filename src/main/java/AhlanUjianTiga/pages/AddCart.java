package AhlanUjianTiga.pages;

import AhlanUjianTiga.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCart {

    private WebDriver driver;
    private String JavascriptExecutor;

    public AddCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/h3/a")
    WebElement openProduct;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement selectColor;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement selectSize;

    @FindBy(xpath = "//*[@id=\"product-1491\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addCart;

    public void addCart() {
        //open Produck
        openProduct.click();
        System.out.println("Open Product");
        delay(1);

        //Pilih Warna
        Select pa_color = new Select(selectColor);
        pa_color.selectByIndex(1);
        pa_color.selectByVisibleText("Grey");
        System.out.println("Select Color Grey");
        delay(1);

        //Pilih Ukuran
        Select pa_size = new Select(selectSize);
        pa_size.selectByIndex(1);
        pa_size.selectByVisibleText("40");
        System.out.println("Select Size 40");
        delay(1);
        //Klik button add cart
        addCart.click();
        System.out.println("Item add to cart succesfully");
    }
    static void delay ( int detik){
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}