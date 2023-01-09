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

public class Search {


    private WebDriver driver;


    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }


    @Test
    public void Search() {

        HomePage homePage = new HomePage(driver);

        homePage.setSearchField("ceaun");
        homePage.clickSearchButton();

        String actualString = driver.findElement(By.cssSelector(".main-container .note-msg")).getText();

        String expectedString = "Your search returns no results.";

        Assert.assertTrue(actualString.contains(expectedString));
    }



    @After
    public void quit() {
        driver.quit();
    }
}
