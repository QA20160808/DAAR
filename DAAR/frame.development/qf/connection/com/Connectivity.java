package qf.connection.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import qf.pom.com.Campains;
import qf.pom.com.Leads;
import qf.pom.com.LoginPage;
import qf.repository.com.Properties;

public class Connectivity implements Properties {
	public static WebDriver driver = null;
	//we can use anotations in java class as well but testng should be added classpath
	@BeforeSuite
	public void launchBrowser() 
	{	
		System.out.println(webSiteURL);
	System.setProperty(chormeDriver,chromepaths);
	driver=new ChromeDriver();
	driver.navigate().to(webSiteURL);
	System.out.println(webSiteURL);
	driver.manage().window().maximize();
	new LoginPage(driver);//initialization of Class where WebElements has been located for login
	new Leads(driver);//initialization of Class where WebElements has been located for leads
	new Campains(driver);//initialization of Class where WebElements has been located for Campains
	}
}
