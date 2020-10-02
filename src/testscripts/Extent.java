package testscripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent {
	
	@Test
	public void extentreport() throws Exception
	{
		//Create Object for extent report
		ExtentReports report=new ExtentReports("./Excel/report.html",false);
		
		//Start the execution
		ExtentTest test = report.startTest("Depends");
		
		//log the status
		test.log(LogStatus.PASS,"pass");
		test.log(LogStatus.FAIL,"fail");
		test.log(LogStatus.SKIP,"skip");
		
		//End the test execution
		report.endTest(test);
		
		//flush
		report.flush();
		
		
		
	}

}
