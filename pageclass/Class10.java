package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomclass10;


public class Class10 {
	private WebDriver driver;
    private Pomclass10 pomclass10;
 

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
        pomclass10 = new Pomclass10(driver); // Corrected initialization
    }

    @Test
    public void testLogin() {
    	pomclass10.enterUsername("Admin");
    	pomclass10.enterPassword("admin123");
    	pomclass10.clickLogin();
    	pomclass10.pim();
    	pomclass10.dropdown();
    	pomclass10.addbuttons();
    	pomclass10.Screendrop();
    	pomclass10.screendrop2();
    	pomclass10.savebutton();
    
    	

        
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        
    }
}
