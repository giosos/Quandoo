package quandoo.de.tests.positivetests;// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import quandoo.de.tests.BaseTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PeopleAmountTest extends BaseTest {

  // Test amount of people for reservation page

  @Test
  public void peopleAmount() {
    driver.get("https://www.quandoo.de/en/place/taleh-thai-6902");
    driver.manage().window().setSize(new Dimension(1771, 992));
    driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
    driver.findElement(By.xpath("//div[@id=\'root\']/section/div[3]/div/section/div/div[2]/div/div/div/div/div/div[2]/div")).click();
    assertThat(driver.findElement(By.cssSelector(".bYjPXH")).getText(), is("2"));

  }
}