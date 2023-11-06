package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario9;

public class Case9 {
	private WebDriver driver;
    private Pomscenario9 pomscenario9;
 

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
        pomscenario9 = new Pomscenario9(driver); // Corrected initialization
    }

    @Test
    public void testLogin() {
    	pomscenario9.enterUsername("Admin");
    	pomscenario9.enterPassword("admin123");
    	pomscenario9.clickLogin();
    	pomscenario9.pim();
    	pomscenario9.dropdown();
    	pomscenario9.addbuttons();
    	pomscenario9.addfirstname("sankappa");
    	pomscenario9.Screendrop();
    	pomscenario9.screendrop2();
    	pomscenario9.savebutton();
    
    	

        
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        
    }
}
