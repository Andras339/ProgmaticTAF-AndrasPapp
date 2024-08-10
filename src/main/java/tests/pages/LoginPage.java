package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(By.id("txt-username"));
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("txt-password"));
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        loginButton.click();
    }

}
