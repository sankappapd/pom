package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario22_23;

public class Case22_23 {
	 private WebDriver driver;
	    private Pomscenario22_23 pomscenario22_23;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario22_23 = new Pomscenario22_23(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario22_23.enterUsername("Admin");
	    	pomscenario22_23.enterPassword("admin123");
	    	pomscenario22_23.clickLogin();
	    	pomscenario22_23.pim();
	    	pomscenario22_23.helpopt();
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
