package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppointmentPage {
    WebDriver driver;
    WebDriverWait wait;

    By makeAppointmentButton = By.id("btn-make-appointment");
    By usernameField = By.id("txt-username");
    By passwordField = By.id("txt-password");
    By loginButton = By.id("btn-login");
    By applyForAdmissionCheckbox = By.id("chk_hospotal_readmission");
    By medicareRadioButton = By.id("radio_program_medicare");
    By visitDateField = By.id("txt_visit_date");
    By commentField = By.id("txt_comment");
    By bookAppointmentButton = By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void completeAppointmentProcess() {
        navigateToLoginPage();
        login();
        fillAppointmentDetails();
    }

    private void navigateToLoginPage() {
        driver.findElement(makeAppointmentButton).click();
    }

    private void login() {
        driver.findElement(usernameField).sendKeys("John Doe");
        driver.findElement(passwordField).sendKeys("ThisIsNotAPassword");
        driver.findElement(loginButton).click();
    }

    private void fillAppointmentDetails() {
        driver.findElement(applyForAdmissionCheckbox).click();
        driver.findElement(medicareRadioButton).click();
        driver.findElement(visitDateField).sendKeys("15/08/2024");
        driver.findElement(commentField).sendKeys("Andras Varazs");
        driver.findElement(bookAppointmentButton).click();
    }
}
