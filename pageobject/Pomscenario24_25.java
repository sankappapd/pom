package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomscenario24_25 {
	private WebDriver driver;
    WebDriverWait wait;

    public Pomscenario24_25(WebDriver driver) {
        this.driver = driver;
    }
 private By usernameInput = By.xpath("//input[@placeholder='Username']");
    private By passwordInput = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By Adminselect = By.className("oxd-main-menu-item--name");
    private By marklocate = By.xpath("(//div[@class=\"oxd-table-header-sort\"])[1]");
    private By ascend = By.xpath("(//span[@class=\"oxd-text oxd-text--span\"])[1]");
    
    
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
    public void Admin() {
    	List<WebElement> menus=driver.findElements(Adminselect);
    	menus.get(0).click();

    }
    public void Mark() {
    	WebElement markbutton =driver.findElement(marklocate);
    	markbutton.click();
    }
    public void Ascending() {
    	WebElement ascendbutton =driver.findElement(ascend);
    	ascendbutton.click();
    }
      
    public void countcol() {
        WebElement countButtonElement = driver.findElement(count);
        countButtonElement.click();
    }
}
