package quandoo.de.tests.positivetests;// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import quandoo.de.pages.RestaurantPage;
import quandoo.de.tests.BaseTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QundooReserveNowTest extends BaseTest {

// Test for reservation complete page

    @Test
    public void qundooReserveNow() throws InterruptedException {
        driver.get("https://www.quandoo.de/en/place/taleh-thai-6902");
        driver.manage().window().setSize(new Dimension(1505, 992));
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        Thread.sleep(2000);
        RestaurantPage.reserveNowBtn();

        assertThat(driver.findElement(By.xpath("//h1[contains(.,\'Complete your reservation\')]")).getText(), is("Complete your reservation"));
        driver.close();
    }
}
