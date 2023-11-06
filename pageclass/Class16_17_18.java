package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario16_17_18;

public class Class16_17_18 {
	 private WebDriver driver;
	    private Pomscenario16_17_18 pomscenario16_17_18;
	    String path=("C:\\Users\\SANKAPPA-PC\\eclipse-workspace\\selenium\\projectssel\\src\\test\\java\\pageclass\\ಕದಂಬ PSI ಮಾದರಿ ಪ್ರಶ್ನೆ ಪತ್ರಿಕೆ.pdf");
	 

	    @BeforeTest
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
	        pomscenario16_17_18 = new Pomscenario16_17_18(driver); // Corrected initialization
	    }

	    @Test
	    public void testLogin() {
	    	pomscenario16_17_18.enterUsername("Admin");
	    	pomscenario16_17_18.enterPassword("admin123");
	    	pomscenario16_17_18.clickLogin();
	    	pomscenario16_17_18.pim();
	    	pomscenario16_17_18.dropdown();
	    	pomscenario16_17_18.clickadd();
	    	pomscenario16_17_18.naeminput("sankappa");
	    	pomscenario16_17_18.cancell();
	    	pomscenario16_17_18.edit();
	    	pomscenario16_17_18.editnaeminput("shreyaskh");
	    	pomscenario16_17_18.save();
	    	
	
	        
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        
	    }
}
