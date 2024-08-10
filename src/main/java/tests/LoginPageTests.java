package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.pages.LoginPage;

public class LoginPageTests {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testInvalidLogin() {
        loginPage.enterUsername("rossznev");
        loginPage.enterPassword("rosszjelszo");
        loginPage.clickLogin();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000); // varakozas mielott be zarodna a test hogy lazzuk a hiba uzenetet
        if (driver != null) {
            driver.quit();
        }
    }
}
