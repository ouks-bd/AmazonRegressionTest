package LeadManagement.pom.base;

import LeadManagement.pom.util.GeneralUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    private Properties properties;

    public BaseTest() {
        try {
            properties = new Properties();
            String filePath = System.getProperty("user.dir")
                    + "\\src\\test\\java\\LeadManagement\\pom\\config\\config.properties";


            FileInputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialization() {
        WebDriverManager.firefoxdriver().setup();
       /*  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/ref=nav_logo");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GeneralUtil.IMPLICIT_WAIT));

    }

    public void ScrollToElementAndClick(WebElement webElement) {
        webElement.isDisplayed();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", webElement);
        GeneralUtil.waitForDomStable();
        webElement.click();
    }

    public String getUsername() {
        return properties.getProperty("username");

    }

    public String getPassword() {
        return properties.getProperty("password");
    }

}
