package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void Openappln()
	{
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void Closeappln(ITestResult res) throws Exception
	{
		
		int status = res.getStatus();
		
		String tcname=res.getName();
		
		if(status==2 || status==3)
		{
			Snapshot.generic_photo(driver, tcname);
		}
		
		driver.quit();
	}

}
