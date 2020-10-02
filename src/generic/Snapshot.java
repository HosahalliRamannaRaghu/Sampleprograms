package generic;

import java.io.File;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Snapshot {
	
	public static void generic_photo(WebDriver driver,String tcname) throws Exception
	{
		String photo="./Screenshots/";
		
		//Date format
		Date d=new Date();
		
		String d1=d.toString();
		
		String date=d1.replaceAll(":","-");
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dst = new File(photo+date+tcname+".jpeg");
		
		Files.copy(src,dst);
		
		Thread.sleep(2000);	
		
	}

}
