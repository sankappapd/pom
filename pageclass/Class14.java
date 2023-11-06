package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario14;

public class Class14 {
	 private WebDriver driver;
	    private Pomscenario14 pomscenario14;
	    String path=("C:\\Users\\SANKAPPA-PC\\eclipse-workspace\\selenium\\projectssel\\src\\test\\java\\pageclass\\ಕದಂಬ PSI ಮಾದರಿ ಪ್ರಶ್ನೆ ಪತ್ರಿಕೆ.pdf");
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario14 = new Pomscenario14(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario14.enterUsername("Admin");
	    	pomscenario14.enterPassword("admin123");
	    	pomscenario14.clickLogin();
	    	pomscenario14.pim();
	    	pomscenario14.dropdown();
	    	pomscenario14.enterupload(path);
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
