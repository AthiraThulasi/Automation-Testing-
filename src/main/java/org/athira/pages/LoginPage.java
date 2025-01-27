package org.athira.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class LoginPage {

    private WebDriver driver;// Member Variable or Instance Variable
    private WebDriverWait wait;//Member Variable or Instance Variable

    // Define Locators
    //private By closeButton = By.id("onetrust-close-btn-container");
    private By signInLink = By.xpath("//span[@class = 'style-module_accountLabel__Gna08 style-module_accountLabel__aZJ5f']");
    private By emailField = By.id("username");
    private By passwordField = By.id("password");
    private By signInButton = By.xpath("//button[@data-automation='sign-in-button']");
    private By accountDropdown = By.xpath("//span[@class='styles-module_flyoutChevronContainer__k78bZ']//*[name()='svg']");
    private By signOutButton = By.xpath("//span[@class='style-module_accountLabel__yJqvg']");

    private static final String ACCOUNT_PAGE_URL = "https://www.bestbuy.ca/account/en-ca";


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Action / Methods

    // Method to close pop-up
    /*public void closePopUp() {
        try {
            WebElement closeButtonElement = wait.until(ExpectedConditions.elementToBeClickable(closeButton));
            closeButtonElement.click();
        } catch (Exception e) {
            System.out.println("Pop-up not found or already closed");
        }
    }*/

    // Method to click on "Sign In" link
    public void clickSignInLink() {
        WebElement signInLinkElement = wait.until(ExpectedConditions.elementToBeClickable(signInLink));
        signInLinkElement.click();
    }

    // Method to enter username
    public void enterUsername(String username) {
        WebElement emailFieldElement = wait.until(ExpectedConditions.elementToBeClickable(emailField));
        //emailFieldElement.click();
        //emailFieldElement.clear();
        emailFieldElement.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        WebElement passwordFieldElement = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordFieldElement.sendKeys(password);
    }

    // Method to click on "Sign In" button
    public void clickSignInButton() {
        WebElement signInButtonElement = wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButtonElement.click();

        // Create a new WebDriverWait object with a higher timeout (4 minutes)
        WebDriverWait longWait = new WebDriverWait(driver, Duration.ofMinutes(4));

        // Wait until the URL contains the expected value
        longWait.until(ExpectedConditions.urlContains(ACCOUNT_PAGE_URL));
    }




    // Method to verify login success
    public boolean isLoginSuccessful() {
            wait.until(ExpectedConditions.urlToBe(ACCOUNT_PAGE_URL)); // Explicit wait for URL stabilization
            return true;
        }



    // Method to verify logout success
    public boolean isLogoutSuccessful() {

            // Verify the URL matches the expected one post-logout
            String expectedUrl = ACCOUNT_PAGE_URL + "#" ;
            wait.until(ExpectedConditions.urlToBe(expectedUrl));
            return true;
    }

    // Method to click on account dropdown
    public void clickAccountDropdown() {
        WebElement accountDropdownElement = wait.until(ExpectedConditions.elementToBeClickable(accountDropdown));
        accountDropdownElement.click();
    }

    // Method to click on "Sign Out" button
    public void clickSignOutButton() {
        WebElement signOutButtonElement = wait.until(ExpectedConditions.elementToBeClickable(signOutButton));
        signOutButtonElement.click();
    }

}