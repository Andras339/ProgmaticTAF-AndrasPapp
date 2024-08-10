package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EndToEndPage {
    private WebDriver driver;

    public EndToEndPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMakeAppointment() {
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("txt-username")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("txt-password")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.id("btn-login")).click();
    }

    public void selectHealthcareProgram(String program) {
        driver.findElement(By.xpath("//input[@value='" + program + "']")).click();
    }

    public void enterVisitDate(String date) {
        driver.findElement(By.id("txt_visit_date")).sendKeys(date);
    }

    public void enterComment(String comment) {
        driver.findElement(By.id("txt_comment")).sendKeys(comment);
    }

    public void clickBookAppointment() {
        driver.findElement(By.id("btn-book-appointment")).click();
    }

    public void clickMenuToggle() {
        driver.findElement(By.id("menu-toggle")).click();
    }

    public void clickLogout() {
        driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
    }
}
