package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest {


    private WebDriver driver;


    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }


    @Test
    public void RegisterTest() {

        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        homePage.clickAccountButton();
        homePage.clickRegisterButton();

        registerPage.setNameField1("Vladimir");
        registerPage.setNameField2("Putin");
        registerPage.setNameField3("Vladimirochi");
        registerPage.setEmailField("vladimirputin@mail.ru");
        registerPage.setPassWordField("mustcrushcapitalism123");
        registerPage.setPassWordField2("mustcrushcapitalism123");
        registerPage.setNewsLetter();

        WebElement register = driver.findElement(By.cssSelector(".buttons-set .button"));
        Assert.assertTrue(register.isDisplayed());
    }

    @After
    public void quit() {
        driver.quit();
    }
}
