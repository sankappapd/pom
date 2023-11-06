package pageclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Scenario1;


public class case1 {

	
	
	
	    private WebDriver driver;
	    private Scenario1 scenario1;

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        scenario1 = new Scenario1(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	        scenario1.enterUsername("Admin");
	        scenario1.enterPassword("admin123");
	        scenario1.clickLogin();
	        scenario1.pim();
	        scenario1.dropdown();
	        scenario1.save();
	        
	        // Add assertions and verifications here
	    }
/*
	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
	    */
	}


