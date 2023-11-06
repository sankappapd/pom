package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario4_5;
import pageobject.Scenario1;

public class Case4_5 {
	 private WebDriver driver;
	    private Pomscenario4_5 pomscenario4;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario4 = new Pomscenario4_5(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario4.enterUsername("Admin");
	    	pomscenario4.enterPassword("admin123");
	    	pomscenario4.clickLogin();
	    	pomscenario4.pim();
	    	pomscenario4.addemployee();
	    	pomscenario4.addname("sankappa");
	    	pomscenario4.addmiddlename("p");
	    	pomscenario4.addlastname("d");
	    	pomscenario4.addimage("C:\\Users\\SANKAPPA-PC\\eclipse-workspace\\selenium\\projectssel\\src\\test\\java\\pageclass\\New Doc 3-min.jpg");
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
	    
	}


