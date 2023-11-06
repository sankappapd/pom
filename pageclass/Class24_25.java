package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario24_25;

public class Class24_25 {
	 private WebDriver driver;
	    private Pomscenario24_25 pomscenario24_25;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario24_25 = new Pomscenario24_25(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario24_25.enterUsername("Admin");
	    	pomscenario24_25.enterPassword("admin123");
	    	pomscenario24_25.clickLogin();
	    	pomscenario24_25.Admin();
	    	pomscenario24_25.Mark();
	    	pomscenario24_25.Ascending();
	    	pomscenario24_25.countcol();
	  
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
