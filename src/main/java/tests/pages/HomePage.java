package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMakeAppointmentButtonClickable() {
        WebElement makeAppointmentButton = driver.findElement(By.id("btn-make-appointment"));
        return makeAppointmentButton.isDisplayed() && makeAppointmentButton.isEnabled();
    }
}
