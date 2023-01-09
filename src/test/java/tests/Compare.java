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
import pages.ProductsPage;

public class Compare {




    private WebDriver driver;


    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void Compare(){

        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        homePage.clickItem1();
        productsPage.clickCompareItem();

        WebElement Compare = driver.findElement(By.xpath("//*[@id=\"messages_product_view\"]/ul/li/ul/li/span"));
        Assert.assertTrue(Compare.isDisplayed());
    }


    @After
    public void quit() {
        driver.quit();
    }
}
