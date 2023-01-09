package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.RegisterTest;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    private WebElement nameField1;

    @FindBy(id = "middlename")
    private WebElement nameField2;

    @FindBy(id = "lastname")
    private WebElement nameField3;

    @FindBy(id = "email_address")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passWordField;

    @FindBy(id = "confirmation")
    private WebElement passWordField2;

    @FindBy(css = "[title='Sign Up for Newsletter']")
    private WebElement newsLetter;

    public void setNameField1(String searchValue) {
        nameField1.clear();
        nameField1.sendKeys(searchValue + Keys.ENTER);
    }

    public void setNameField2(String searchValue) {
        nameField2.clear();
        nameField2.sendKeys(searchValue + Keys.ENTER);
    }

    public void setNameField3(String searchValue) {
        nameField3.clear();
        nameField3.sendKeys(searchValue + Keys.ENTER);
    }

    public void setEmailField(String searchValue) {
        emailField.clear();
        emailField.sendKeys(searchValue + Keys.ENTER);
    }

    public void setPassWordField(String searchValue) {
        passWordField.clear();
        passWordField.sendKeys(searchValue + Keys.ENTER);
    }

    public void setPassWordField2(String searchValue) {
        passWordField2.clear();
        passWordField2.sendKeys(searchValue + Keys.ENTER);
    }

    public void setNewsLetter() {
        newsLetter.click();
    }
}

