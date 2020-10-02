package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends {
	
	@Test
	public void compose()
	{
		System.out.println("compose");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="compose")
	public void sentitems()
	{
		System.out.println("sentitems");
	}
	
	@Test(groups="vidya")
	public void trash()
	{
		System.out.println("Trash");
	}

}
