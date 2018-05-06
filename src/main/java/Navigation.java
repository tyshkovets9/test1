import org.openqa.selenium.support.PageFactory;

public class Navigation {
    public static FacebookLoginPage openFacebookLoginPage() {
        BrowserType.browser.get("https://www.facebook.com");
        return PageFactory.initElements(BrowserType.browser, FacebookLoginPage.class);
    }

}
