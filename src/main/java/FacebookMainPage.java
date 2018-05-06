import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookMainPage {
    @FindBy(className = "homeSideNav")
    WebElement Username;

    public String getUsername(String text) {
        return Username.getText();
    }
}
