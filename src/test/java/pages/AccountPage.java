package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class AccountPage {

    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".hello strong")
    private WebElement welcomeTextElement;

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }

    @FindBy(css = ".you p")
    private WebElement goodbyeTextElement;

    public String getGoodbyeText(){
        return goodbyeTextElement.getText();
    }

    @FindBy(css = ".skip-active .empty")
    private WebElement EmptyCartElement;

    public String getEmptyCartElement(){
        return EmptyCartElement.getText();
    }
}
