package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import tests.pages.AppointmentPage;

public class AppointmentPageTests {
    private WebDriver driver;
    private AppointmentPage appointmentPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        appointmentPage = new AppointmentPage(driver);
    }

    @Test
    public void testCompleteAppointmentBooking() {
        appointmentPage.completeAppointmentProcess();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000); // hogy le lassuk hogy tenyleg meg lett az apointment
        driver.quit();
    }
}
