package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.HomePage;

public class OpenCart {


    private WebDriver driver;


    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }


    @Test
    public void OpenCart() {

        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homePage.clickCart();
        Assert.assertEquals("You have no items in your shopping cart.", accountPage.getEmptyCartElement());
    }



    @After
    public void quit() {driver.quit();}
}
