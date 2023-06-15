package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver webDriver;
    @Before
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webDriver= new ChromeDriver(options);
        String URL = "https://www.service.nsw.gov.au/";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
    }
    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}

