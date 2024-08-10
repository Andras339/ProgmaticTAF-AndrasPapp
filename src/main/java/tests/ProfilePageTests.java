package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.pages.ProfilePage;

public class ProfilePageTests {
    WebDriver driver;
    ProfilePage profilePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        profilePage = new ProfilePage(driver);
    }

    @Test
    public void testNavigateToProfilePage() {
        profilePage.openMenuAndLogin("John Doe", "ThisIsNotAPassword");
        profilePage.navigateToProfilePage();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
