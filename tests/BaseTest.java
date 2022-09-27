package quandoo.de.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import quandoo.de.pages.HomePage;
import quandoo.de.pages.LogInPage;
import quandoo.de.pages.RestaurantPage;

// Classes

public class BaseTest {
    protected HomePage homePage;
    protected WebDriver driver;
    protected JavascriptExecutor js;

    RestaurantPage restaurantPage;
    LogInPage logInPage;


    @Before

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        restaurantPage = new RestaurantPage(driver);
        logInPage = new LogInPage(driver);


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
