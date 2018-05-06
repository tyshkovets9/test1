import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
    @FindBy(id = "email")
    WebElement loginField;

    @FindBy(id="pass")
    WebElement passwordField;

    public FacebookMainPage loginWithUser(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password, Keys.ENTER);
        return PageFactory.initElements(BrowserType.browser, FacebookMainPage.class);
    }
}


