package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomscenario6 {
	 private WebDriver driver;
	    WebDriverWait wait;

	    public Pomscenario6(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Define page elements with XPath locators
	    private By usernameInput = By.xpath("//input[@placeholder='Username']");
	    private By passwordInput = By.xpath("//input[@placeholder='Password']");
	    private By loginButton = By.xpath("//button[@type='submit']");
	    private By pimselect = By.className("oxd-main-menu-item--name");
	    private By addemployees = By.xpath("//a[normalize-space()='Add Employee']");
	    private By username1 = By.xpath("//input[@placeholder='First Name']");
	    private By middle = By.xpath("//input[@placeholder='Middle Name']");
	    private By last = By.xpath("//input[@placeholder='Last Name']");

	    
	    

	    // Define page actions
	    public void enterUsername(String username) {
	        WebElement usernameElement = driver.findElement(usernameInput);
	        usernameElement.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        WebElement passwordElement = driver.findElement(passwordInput);
	        passwordElement.sendKeys(password);
	    }

	    public void clickLogin() {
	        WebElement loginButtonElement = driver.findElement(loginButton);
	        loginButtonElement.click();
	    }
	    public void pim() {
	    	List<WebElement> menus=driver.findElements(pimselect);
	    	menus.get(1).click();
	
	    }
	   public void addemployee() {
		   WebElement addemployee = driver.findElement(addemployees);
		   addemployee.click();
	    }
	   public void addname(String name1) {
		   WebElement nameElement =driver.findElement(username1);
		   nameElement.sendKeys(name1);

	   }
	   public void addmiddlename(String middlename) {
		   WebElement nameElement =driver.findElement(middle);
		   nameElement.sendKeys(middlename);

	   }  
	   public void addlastname(String lastname) {
		   WebElement nameElement =driver.findElement(last);
		   nameElement.sendKeys(lastname);
	   }   
	    public void addimage(String filepath) {
	    
	    	WebElement photo=driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']"));
	    	photo.sendKeys(filepath);
	    	
	    }
}
