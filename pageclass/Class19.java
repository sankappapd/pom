package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario19;

public class Class19 {
	 private WebDriver driver;
	    private Pomscenario19 pomscenario19;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario19 = new Pomscenario19(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario19.enterUsername("Admin");
	    	pomscenario19.enterPassword("admin123");
	    	pomscenario19.clickLogin();
	    	pomscenario19.pim();
	    	pomscenario19.dropdown();
	    	pomscenario19.clickadd();
	    	pomscenario19.naeminput("sankappa");
	    	pomscenario19.save();
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
