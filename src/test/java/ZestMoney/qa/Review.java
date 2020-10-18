package ZestMoney.qa;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utilities.BaseClass;
import Utilities.EnterTitleAndText;
import Utilities.GiveRating;
import Utilities.GoToDestinationPage;
import Utilities.GoToNewTab;
import Utilities.ReviewDescription;

public class Review extends BaseClass {
	@BeforeTest()
	public void browserInitialize() throws IOException {
		driver = initializeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
	}

	@Test()
	public void SubmitReview() throws IOException, InterruptedException {
		GoToDestinationPage.destinationGo();
		GoToNewTab.SwitchToChildWindow();
		EnterTitleAndText.ClickGiveReview();
		GiveRating.selectRating(driver, 5, "//span[@id='bubble_rating']", 30);
		ReviewDescription.TitleAndText();
		try {
			driver.findElement(By.id("DQ_RATINGS"));
			GiveRating.selectRating(driver, 5, "//span[@id='qid12_bubbles']", 20);
			GiveRating.selectRating(driver, 5, "//span[@id='qid13_bubbles']", 20);
			GiveRating.selectRating(driver, 5, "//span[@id='qid14_bubbles']", 20);
			GiveRating.selectRating(driver, 5, "//span[@id='qid47_bubbles']", 20);
			GiveRating.selectRating(driver, 5, "//span[@id='qid11_bubbles']", 20);
			GiveRating.selectRating(driver, 5, "//span[@id='qid190_bubbles']", 20);
		} catch (Exception e) {
		}
		driver.findElement(By.name("noFraud")).click();
	}
}
