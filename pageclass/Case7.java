package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario7;

public class Case7 {
	private WebDriver driver;
    private Pomscenario7 pomscenario7;
 

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
        pomscenario7 = new Pomscenario7(driver); // Corrected initialization
    }

    @Test
    public void testLogin() {
    	pomscenario7.enterUsername("Admin");
    	pomscenario7.enterPassword("admin123");
    	pomscenario7.clickLogin();
    	pomscenario7.pim();
    	pomscenario7.addemployee();
    	pomscenario7.addmiddlename("p");
    	pomscenario7.addlastname("d");
    	pomscenario7.savebutton();
    	

        
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        
    }
    
}
