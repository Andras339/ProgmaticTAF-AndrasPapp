package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.pages.EndToEndPage;

public class EndToEndPageTest {
    private WebDriver driver;
    private EndToEndPage endToEndPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        endToEndPage = new EndToEndPage(driver);
    }

    @Test
    public void testEndToEndBooking() throws InterruptedException {
        endToEndPage.clickMakeAppointment();

        endToEndPage.enterUsername("John Doe");
        endToEndPage.enterPassword("ThisIsNotAPassword");
        endToEndPage.clickLoginButton();

        endToEndPage.selectHealthcareProgram("Medicare");
        endToEndPage.enterVisitDate("27/08/2024");
        endToEndPage.enterComment("Andras Varazs mostmar kiegve...:D");
        endToEndPage.clickBookAppointment();

        endToEndPage.clickMenuToggle();
        Thread.sleep(2000); //kicsit varozkatatom hogy latszodjon a "Logout" menu
        endToEndPage.clickLogout();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(3000);
            driver.quit();
        }
    }
}
