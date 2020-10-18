package Utilities;

import java.util.ArrayList;
import java.util.Set;

public class GoToNewTab extends BaseClass{

	public static void SwitchToChildWindow()
	{
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList(allWindows);
		driver.switchTo().window(tabs.get(1));
	}
}
