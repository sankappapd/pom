package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario20;

public class Class20 {
	 private WebDriver driver;
	    private Pomscenario20 pomscenario20;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario20 = new Pomscenario20(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario20.enterUsername("Admin");
	    	pomscenario20.enterPassword("admin123");
	    	pomscenario20.clickLogin();
	    	pomscenario20.pim();
	    	pomscenario20.dropdown();
	    	pomscenario20.clickadd();
	    	pomscenario20.naeminput("sankappa");
	    	pomscenario20.cancell();
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
