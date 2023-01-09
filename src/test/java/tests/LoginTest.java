package tests;

import org.junit.Assert;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void LoginTest() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homePage.clickAccountButton();
        homePage.clickLoginLink();
        loginPage.setEmailField("vladimirputin@mail.ru");
        loginPage.setPasswordField("mustcrushcapitalism123");
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, Vladimir Putin Vladimirochi!", accountPage.getWelcomeText());
    }

    @After
    public void quit() {
        driver.quit();}
}