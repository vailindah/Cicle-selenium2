import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class Base {
    public static WebDriver webDriver;

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://staging.cicle.app");
        Thread.sleep(2000);

        logincicle loginPage = new logincicle(webDriver);
        loginPage.clickLogin();
        loginPage.setEmail("cilsynurindah@gmail.com");
        loginPage.clicknext1();
        Thread.sleep(2000);
        loginPage.setPassw("CilsyBP2022");
        loginPage.clicknext();
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        String namehello = dasboardPage.getName();
        Thread.sleep(2000);
    }
}

