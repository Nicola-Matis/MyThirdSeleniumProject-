package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

    private WebDriver driver;

    public WishlistPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


}
