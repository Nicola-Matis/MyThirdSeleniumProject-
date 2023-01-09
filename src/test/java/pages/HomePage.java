package pages;

import com.sun.source.tree.WildcardTree;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.OpenCart;
import tests.Search;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".skip-account .label")
    private WebElement accountButton;

    @FindBy(css = "[title='Log In']")
    private WebElement loginLink;

    @FindBy(css = "[title='Log Out']")
    private WebElement logoutLink;

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(css = ".skip-cart .label")
    private WebElement Cart;

    @FindBy(css = "[title='Search']")
    private WebElement searchButton;

    @FindBy(css = "[title='Register']")
    private WebElement registerLink;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[1]/a/img")
    private WebElement Item1;

    public void clickAccountButton() {
        accountButton.click();
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void clickLogoutLink(){
        logoutLink.click();
    }

    public void setSearchField(String searchValue) {
        searchField.clear();
        searchField.sendKeys(searchValue + Keys.ENTER);
    }

    public void clickCart(){
        Cart.click();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickRegisterButton(){
        registerLink.click();
    }

    public void clickItem1(){
        Item1.click();
    }
}
