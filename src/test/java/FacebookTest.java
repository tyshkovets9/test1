import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookTest {
    private static final String login ="";
    private static final String password ="";

    @BeforeClass
    public void browser() {
        BrowserType.openBrowser();
    }

    @Test
    public void testSearch() {
        Navigation.openFacebookLoginPage()
                .loginWithUser( login, password)
                .getUsername("");
    }

    @AfterTest
    public void closeBrowser() {
        BrowserType.closeBrowser();
    }
}

