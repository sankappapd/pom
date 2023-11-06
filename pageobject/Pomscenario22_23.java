package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pomscenario22_23 {
	private WebDriver driver;
    WebDriverWait wait;

    public Pomscenario22_23(WebDriver driver) {
        this.driver = driver;
    }
 private By usernameInput = By.xpath("//input[@placeholder='Username']");
    private By passwordInput = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By pimselect = By.className("oxd-main-menu-item--name");
    private By help = By.xpath("//i[@class='oxd-icon bi-question-lg']");
    
    

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
   
    public void helpopt() {
        WebElement helpButtonElement = driver.findElement(help);
        helpButtonElement.click();
    }
}
