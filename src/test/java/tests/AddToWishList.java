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
import pages.LoginPage;
import pages.ProductsPage;
import pages.WishlistPage;

public class AddToWishList {



    private WebDriver driver;


    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }



    @Test
    public void AddToWishList() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);

        homePage.clickAccountButton();
        homePage.clickLoginLink();
        loginPage.setEmailField("vladimirputin@mail.ru");
        loginPage.setPasswordField("mustcrushcapitalism123");
        loginPage.clickLoginButton();

        productsPage.clickSaleCategory();
        productsPage.clickAddToWishlistFromCategory();


        WebElement wishListAdd = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > ul > li > ul > li > span")); //.succes-msg
        Assert.assertTrue(wishListAdd.isDisplayed());
    }


    @After
    public void quit() {
        driver.quit();
    }
}
