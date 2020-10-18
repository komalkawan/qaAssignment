package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import PageObjects.PageObjects;

public class EnterTitleAndText extends BaseClass{

	public static void ClickGiveReview() {		
		PageObjects obj = new PageObjects(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Write a review'] [@class='_1748LPGe']"));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)", element);
		element.click();
//		obj.ReviewTitle().sendKeys(prop.getProperty("ReviewTitle"));
//		obj.ReviewText().sendKeys(prop.getProperty("ReviewText"));
	}
}
