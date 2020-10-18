package Utilities;

import org.openqa.selenium.Keys;
import PageObjects.PageObjects;

public class GoToDestinationPage extends BaseClass {
	public static void destinationGo() throws InterruptedException {
		PageObjects obj = new PageObjects(driver);
		obj.destination().sendKeys("Club Mahindra" + Keys.ENTER);
		obj.MyFunction();
		obj.Clickdestination().click();
	}
}