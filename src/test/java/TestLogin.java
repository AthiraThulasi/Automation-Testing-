import org.athira.pages.LoginPage;
import org.athira.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestLogin {

    private WebDriver driver;// WebDriver instance variable
    private WebDriverWait wait;
    private LoginPage loginPage;// why is this removed from TestLoginPage ?
    //Declared at the class level so it can be accessed across methods.
    private ConfigReader configReader; // ConfigReader instance variable
    private String username ;// Declare credentials as instance variables
    private String password ;

    private static final String HOME_PAGE_URL = "https://www.bestbuy.ca/en-ca";
    private static final String ACCOUNT_PAGE_URL = "https://www.bestbuy.ca/account/en-ca";
    private static final String LOGGED_OUT_PAGE_URL = "https://www.bestbuy.ca/account/en-ca#";


    // Runs before each test
    @Before
    public void setUp() {
        configReader = new ConfigReader(); // Initialize ConfigReader
        driver = new ChromeDriver(); // Initialize WebDriver
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        loginPage = new LoginPage(driver);

        //loginPage = new LoginPage(driver); // why is this removed from TestLoginPage ?
        // When i removed the initialization>> Got error >> loginPage is null, and throw a NullPointerException.

        // Get username and password from config file
       username = configReader.getProperty("username");
       password = configReader.getProperty("password");

    }

    // Runs after each test
    @After
    public void tearDown() {
        driver.quit(); // Close the browser
    }

    // Test case for login and logout functionality
    @Test
    public void testLoginAndLogout() {

        LoginPage loginPage = new LoginPage(driver);
        //loginPage.closePopUp();

        loginPage.clickSignInLink ();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickSignInButton();

        wait.until(ExpectedConditions.urlToBe(ACCOUNT_PAGE_URL));

       // loginPage.showMenu();
        loginPage.clickSignOutButton();

        wait.until(ExpectedConditions.urlToBe(LOGGED_OUT_PAGE_URL));
        Assert.assertEquals(driver.getCurrentUrl(), LOGGED_OUT_PAGE_URL);
    }

    private void openHomePage() {
        driver.get(HOME_PAGE_URL);
    }


}




