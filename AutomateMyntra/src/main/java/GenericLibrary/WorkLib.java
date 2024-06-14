package GenericLibrary;

import java.util.Set;

public class WorkLib extends BaseTest{
	
	public void toSwitchOnWindow(String title)
	{
		Set<String> allId = driver.getWindowHandles();
		for(String id:allId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals(title))
			{
				break;
			}
		}
	}

}
