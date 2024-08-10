package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.pages.HomePage;

public class HomePageTests {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @Test
    public void testMakeAppointmentButtonIsClickable() {
        Assert.assertTrue(homePage.isMakeAppointmentButtonClickable(), "The 'Make Appointment' button is not clickable.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
