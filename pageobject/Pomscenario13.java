package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomscenario13 {
	 private WebDriver driver;
	    WebDriverWait wait;

	    public Pomscenario13(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Define page elements with XPath locators
	    private By usernameInput = By.xpath("//input[@placeholder='Username']");
	    private By passwordInput = By.xpath("//input[@placeholder='Password']");
	    private By loginButton = By.xpath("//button[@type='submit']");
	    private By pimselect = By.className("oxd-main-menu-item--name");
	    private By pimdropdown = By.xpath("//i[@class=\"oxd-icon bi-chevron-down\"]");
	    private By addbutton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
	    private By screen = By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[1]");
	    private By type = By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[2]");
	    private By cancel = By.xpath("//button[normalize-space()='Cancel']");
	    private By delete = By.xpath("//div[@role='table']//div[1]//div[1]//div[5]//div[1]//button[1]//i[1]");

	    
	    

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
	    public void dropdown() {
	    	WebElement configdropdown =  driver.findElement(pimdropdown);
	    	Actions actions = new Actions(driver);
			actions.click(configdropdown).build().perform();
			WebElement optionToSelect = driver.findElement(By.xpath("//a[normalize-space()='Custom Fields']"));
			optionToSelect.click();
	    }
	    public void addbuttons() {
	        WebElement addButtonElement = driver.findElement(addbutton);
	        addButtonElement.click();
	    }
	    public void Screendrop() {
	    	 WebElement dropdown1=driver.findElement(screen);
	    	 dropdown1.click();
	    WebElement first = driver.findElement(By.xpath("//*[text()='Contact Details']"));
	    first.click();
	    }
	    public void screendrop2() {
	    	 WebElement dropdown2=driver.findElement(type);
	    	 dropdown2.click();
	    WebElement second = driver.findElement(By.xpath("//*[text()='Text or Number']"));
	    second.click();	 
	    }
	    public void cancel() {
	    	 WebElement Cancels=driver.findElement(cancel);
	    	 Cancels.click();
	    }
	    public void delete() {
	    	 WebElement deleteElement=driver.findElement(delete);
	    	 deleteElement.click();
	    	 WebElement deleteconfirm=driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']"));
	    	
	    	 deleteconfirm.click();
	    }
}
