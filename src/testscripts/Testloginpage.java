package testscripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic.Launch;
import generic.Verification;
import pom.loginpage;

public class Testloginpage extends Launch {

	@Test
	public void Testlogin()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		loginpage lp=new loginpage(driver);
		lp.username("admin");
		lp.password("manager");
		
		Verification v=new Verification();
		v.verifytitle(driver,"Enter");		
		
		System.out.println("Title is matching....");
		
	}
	
}
