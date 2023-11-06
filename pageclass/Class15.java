package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario15;

public class Class15 {
	 private WebDriver driver;
	    private Pomscenario15 pomscenario15;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario15 = new Pomscenario15(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario15.enterUsername("Admin");
	    	pomscenario15.enterPassword("admin123");
	    	pomscenario15.clickLogin();
	    	pomscenario15.pim();
	    	pomscenario15.dropdown();
	    	pomscenario15.clickadd();
	    	pomscenario15.naeminput("sankappa");
	    	pomscenario15.save();
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
