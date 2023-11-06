package pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Pomscenario8;

public class Case8 {
	private WebDriver driver;
    private Pomscenario8 pomscenario8;
 

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your login page URL
        pomscenario8 = new Pomscenario8(driver); // Corrected initialization
    }

    @Test
    public void testLogin() {
    	pomscenario8.enterUsername("Admin");
    	pomscenario8.enterPassword("admin123");
    	pomscenario8.clickLogin();
    	pomscenario8.pim();
    	pomscenario8.addemployee();
    	pomscenario8.addmiddlename("p");
    	pomscenario8.addlastname("d");
    	pomscenario8.Cancelbutton();
    	

        
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        
    }
}
