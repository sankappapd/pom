package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario6;

public class Case6 {
	 private WebDriver driver;
	    private Pomscenario6 pomscenario6;
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario6 = new Pomscenario6(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario6.enterUsername("Admin");
	    	pomscenario6.enterPassword("admin123");
	    	pomscenario6.clickLogin();
	    	pomscenario6.pim();
	    	pomscenario6.addemployee();
	    	pomscenario6.addname("sankappa");
	    	pomscenario6.addmiddlename("p");
	    	pomscenario6.addlastname("d");
	    	pomscenario6.addimage("C:\\Users\\SANKAPPA-PC\\eclipse-workspace\\selenium\\projectssel\\src\\test\\java\\pageclass\\New Doc 3-min.jpg");
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
	    
}
