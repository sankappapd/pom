package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario21;

public class Class21 {
	 private WebDriver driver;
	    private Pomscenario21 pomscenario21;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario21 = new Pomscenario21(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario21.enterUsername("Admin");
	    	pomscenario21.enterPassword("admin123");
	    	pomscenario21.clickLogin();
	    	pomscenario21.pim();
	    	pomscenario21.dropdown();
	   	    pomscenario21.countcol();
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
