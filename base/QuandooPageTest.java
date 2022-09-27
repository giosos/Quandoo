package quandoo.de.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class QuandooPageTest extends BaseTest {
    public QuandooPageTest(WebDriver driver) {
        super(driver);
    }

    @Before
    public void setUp() {
        getDriver().get("www.google.de");

    }

    @After
    public void tearDown() {
        getDriver().quit();
    }

}
