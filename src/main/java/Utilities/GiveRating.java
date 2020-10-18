package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiveRating extends BaseClass{
	public static void selectRating(WebDriver driver, int numberOfStars, String ratingPath, int offset)
			throws InterruptedException {
		try {
			WebElement element = driver.findElement(By.xpath(ratingPath));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Actions action = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			ExpectedCondition<WebElement> hoverRight = ExpectedConditions.visibilityOfElementLocated(By.xpath(ratingPath));
			int starPoint = 0;
			for (int i = 1; i < numberOfStars; i++) {
				starPoint = offset * i;
				action.moveToElement(wait.until(hoverRight), starPoint, 0).build().perform();
				Thread.sleep(500);
			}
			starPoint = offset * numberOfStars;
			action.moveToElement(wait.until(hoverRight), starPoint, 0).click().build().perform();
		} catch (Exception e) {

		}
	}
}
