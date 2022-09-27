package quandoo.de.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantPage extends Page {
    public RestaurantPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@data-qa='button-search-find-header']")
    static WebElement findButton;

    @FindBy(xpath = "//*[@data-qa='search-bar-near-me-icon']")
    static WebElement nearMeIcon;

    @FindBy(xpath = "//*[@data-qa='search-bar-dining-input']")
    static WebElement searchBar;

    @FindBy (xpath = "//*[@data-qa='reservation-tab']")
    static WebElement reserveNowBtn;



    public void findButton() throws InterruptedException {
        findButton.click();
        Thread.sleep(5000);

    }

    public void nearMeIcon() throws InterruptedException {
        nearMeIcon.click();
        Thread.sleep(5000);

    }

    public void searchBar() throws InterruptedException {
        searchBar.click();
        Thread.sleep(5000);

    }
    public static void reserveNowBtn() throws InterruptedException {
        reserveNowBtn.click();
        Thread.sleep(7000);

    }

}
