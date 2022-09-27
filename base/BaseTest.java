package quandoo.de.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import quandoo.de.pages.HomePage;
import quandoo.de.pages.RestaurantPage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected RestaurantPage restaurantPage;

    public BaseTest(WebDriver driver) {

    }

    @Before
    public void setUp() {


        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        setDriver(new ChromeDriver());
        getDriver().get("https://www.quandoo.de/en/place/taleh-thai-6902");
    }

    @After
    public void tearDown() {
        getDriver().quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePage homePage) {
        this.homePage = homePage;
    }
}
