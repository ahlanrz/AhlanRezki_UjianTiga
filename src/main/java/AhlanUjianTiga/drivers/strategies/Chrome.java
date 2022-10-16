package AhlanUjianTiga.drivers.strategies;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
    public ChromeDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp SQA\\chromedriver.exe"); //WebDriversManagers.chrome.setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");

        return new ChromeDriver(options);
    }
}
