package AhlanUjianTiga;

import AhlanUjianTiga.drivers.DriverSingleton;
import AhlanUjianTiga.pages.WebTables;
import AhlanUjianTiga.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        WebTables webTables = new WebTables();
        webTables.registerForm();

//        delay(5);
//        driver.quit();
    }
        static void delay ( int detik){

            try {
                Thread.sleep(1000 * detik);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

