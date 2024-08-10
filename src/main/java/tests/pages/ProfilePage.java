package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wait;

    By menuToggle = By.id("menu-toggle");
    By loginLink = By.xpath("//a[contains(text(),'Login')]");
    By usernameField = By.id("txt-username");
    By passwordField = By.id("txt-password");
    By loginButton = By.id("btn-login");
    By appointmentPageMenuToggle = By.id("menu-toggle");
    By profileLink = By.xpath("//a[contains(text(),'Profile')]");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void openMenuAndLogin(String username, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(menuToggle)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void navigateToProfilePage() {
        wait.until(ExpectedConditions.elementToBeClickable(appointmentPageMenuToggle)).click();
        wait.until(ExpectedConditions.elementToBeClickable(profileLink)).click();
    }
}
