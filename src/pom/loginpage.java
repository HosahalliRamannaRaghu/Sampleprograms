package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	//Declaration
	@FindBy(id="username")
	private WebElement usn;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	//Initialization
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void username(String usnn)
	{
		usn.sendKeys(usnn);
	}
	
	public void password(String pwdd)
	{
		pwd.sendKeys(pwdd);
	}
	
	public void loginb()
	{
		login.click();
	}
	

}
