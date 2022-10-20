package AhlanUjianTiga;

import AhlanUjianTiga.drivers.DriverSingleton;
import AhlanUjianTiga.pages.AddCart;
import AhlanUjianTiga.pages.Home;
import AhlanUjianTiga.pages.Login;
import AhlanUjianTiga.pages.Register;
import AhlanUjianTiga.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        //home
        Home home = new Home();
        home.home();

        js.executeScript("window.scrollBy(0,500)");
        delay(1);

//        Register register = new Register();
//        register.register("Kanslay","kanslay@gmail.com","k4nslay@123");
//        System.out.println("Register Succesfully");

        Login login = new Login();
        login.login("kanslay@gmail.com", "k4nslay@123");
        System.out.println("Login Succesfully");
        delay(1);

        driver.get("https://shop.demoqa.com");
        System.out.println("back home");
        delay(1);

        js.executeScript("window.scrollBy(0,1100)");
        delay(1);

        AddCart addCart = new AddCart();
        addCart.addCart();

        delay(5);
        driver.quit();
    }
        static void delay ( int detik){
            try {
                Thread.sleep(1000 * detik);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

