package quandoo.de.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends Page {
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    //Find elements section

    @FindBy(xpath = "//*[@data-qa='social-provider-btn-google']")
    static WebElement socialBtnGoogle;

    @FindBy(xpath = "//*[@data-qa='social-provider-btn-facebook']")
    static WebElement socialBtnFacebook;

    @FindBy(xpath = "//*[@data-qa='social-provider-btn-apple']")
    static WebElement socialBtnApple;




    // Push the button section


    public static void clickSocialBtnGoogle() throws InterruptedException {
        socialBtnGoogle.click();
        Thread.sleep(7000);
    }

    public static void clickSocialBtnFacebook() throws InterruptedException {
        socialBtnFacebook.click();
        Thread.sleep(7000);
    }

    public static void clickSocialBtnApple() throws InterruptedException {
        socialBtnApple.click();
        Thread.sleep(7000);
    }
}