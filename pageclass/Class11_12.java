package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario11_12;

public class Class11_12 {
	private WebDriver driver;
    private Pomscenario11_12 pomscenario11;
 

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
        pomscenario11 = new Pomscenario11_12(driver); // Corrected initialization
    }

    @Test
    public void testLogin() {
    	pomscenario11.enterUsername("Admin");
    	pomscenario11.enterPassword("admin123");
    	pomscenario11.clickLogin();
    	pomscenario11.pim();
    	pomscenario11.dropdown();
    	pomscenario11.addbuttons();
    	pomscenario11.Screendrop();
    	pomscenario11.screendrop2();
    	pomscenario11.cancel();
    	pomscenario11.edit();
    
    	

        
    }
/*
    @AfterTest
    public void tearDown() {
        driver.quit();
        
    }*/
}
