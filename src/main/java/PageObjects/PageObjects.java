package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjects {
	WebDriver driver;
	WebDriverWait wait;
	public PageObjects(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,10);
	}

	By destination = By.xpath("//input[@placeholder='Where to?']");

	public WebElement destination() {
		return driver.findElement(destination);
	}
	
	By Clickdestination = By.xpath("//div[@class='ui_columns is-mobile result-content-columns']");

	public WebElement Clickdestination() {
		return driver.findElement(Clickdestination);
	}
	public void MyFunction(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Clickdestination));
    } 
	By ReviewTitle = By.name("ReviewTitle");

	public WebElement ReviewTitle() {
		return driver.findElement(ReviewTitle);
	}
	By ReviewText = By.name("ReviewText");

	public WebElement ReviewText() {
		return driver.findElement(ReviewText);
	}

}