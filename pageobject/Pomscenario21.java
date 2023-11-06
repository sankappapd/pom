package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomscenario21 {
	private WebDriver driver;
    WebDriverWait wait;

    public Pomscenario21(WebDriver driver) {
        this.driver = driver;
    }
 private By usernameInput = By.xpath("//input[@placeholder='Username']");
    private By passwordInput = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By pimselect = By.className("oxd-main-menu-item--name");
    private By pimdropdown = By.xpath("//i[@class=\"oxd-icon bi-chevron-down\"]");
    private By count = By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    
    

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
		WebElement optionToSelect = driver.findElement(By.xpath("//a[normalize-space()='Termination Reasons']"));
		optionToSelect.click();
    }
    public void countcol() {
        WebElement countButtonElement = driver.findElement(count);
        countButtonElement.click();
    }
}
