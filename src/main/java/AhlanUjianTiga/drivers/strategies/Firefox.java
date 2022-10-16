package AhlanUjianTiga.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public ChromeDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "D:\\Bootcamp SQA\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return (ChromeDriver) driver;
    }
}
