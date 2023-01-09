package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#nav > ol > li.level0.nav-5.parent > a") //.active .has-children
    private WebElement saleCategory;

    @FindBy(css = ".add-to-links .link-wishlist")
    private WebElement addToWishlistFromCategory;

    @FindBy(xpath = "//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/ul[1]/li[2]/a")
    private WebElement compareItem;

    public void clickSaleCategory(){
        saleCategory.click();
    }

    public void clickAddToWishlistFromCategory(){
        addToWishlistFromCategory.click();
    }

    public void clickCompareItem(){
        compareItem.click();
    }
}
