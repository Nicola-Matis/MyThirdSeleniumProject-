package tests;

import com.sun.source.tree.AssertTree;
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
import pages.LoginPage;

public class LoginLogout {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }



    @Test
    public void LoginLogout() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickAccountButton();
        homePage.clickLoginLink();
        loginPage.setEmailField("vladimirputin@mail.ru");
        loginPage.setPasswordField("mustcrushcapitalism123");
        loginPage.clickLoginButton();
        homePage.clickAccountButton();
        homePage.clickLogoutLink();

        String actualString = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > p")).getText();

        String expectedString = "You have logged out and will be redirected to our homepage in 5 seconds.";

        Assert.assertTrue(actualString.contains(expectedString));
    }



    @After
    public void quit() {
        driver.quit();
    }
}
