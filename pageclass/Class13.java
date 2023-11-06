package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario13;


public class Class13 {
	private WebDriver driver;
    private Pomscenario13 pomscenario13;
 

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
        pomscenario13 = new Pomscenario13(driver); // Corrected initialization
    }

    @Test
    public void testLogin() {
    	pomscenario13.enterUsername("Admin");
    	pomscenario13.enterPassword("admin123");
    	pomscenario13.clickLogin();
    	pomscenario13.pim();
    	pomscenario13.dropdown();
    	pomscenario13.addbuttons();
    	pomscenario13.Screendrop();
    	pomscenario13.screendrop2();
    	pomscenario13.cancel();
    	pomscenario13.delete();
    
    	

        
    }
/*
    @AfterTest
    public void tearDown() {
        driver.quit();
        
    }*/
}
