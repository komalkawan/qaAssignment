package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import PageObjects.PageObjects;

public class ReviewDescription extends BaseClass{
	public static void TitleAndText() {		
		PageObjects obj = new PageObjects(driver);
		obj.ReviewTitle().sendKeys(prop.getProperty("ReviewTitle"));
		obj.ReviewText().sendKeys(prop.getProperty("ReviewText"));

	}
}
