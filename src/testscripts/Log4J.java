package testscripts;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Log4J {
	
	@Test
	public void logreport() throws Exception
	{
		//Pattern
		Layout layout = new PatternLayout("%d %c %m %n");
		
		//appender
		Appender appender=new FileAppender(layout,"./Excel/r.log");
		
		//Configure log4J
		BasicConfigurator.configure(appender);
		
		//Get the object of LOG4J
		Logger log = Logger.getLogger(this.getClass());
		
		//Print the message
		
		log.warn("warning");
		log.error("error");
		log.info("information");
		
		
		
		
	}

}
