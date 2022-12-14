package jana.connection.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import jana.reposirty.com.Property;

import jana.connection.com.*;
import jana.pom.com.AccountPage;
import jana.pom.com.CustomerPage;
import jana.pom.com.EnquiryPage;
import jana.pom.com.LoginPage;

public class Connection implements Property {

	public static WebDriver driver = null;

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty(chromeDriver, chromePath);
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		new LoginPage(driver);
		new CustomerPage(driver);
		new EnquiryPage(driver);
		new AccountPage(driver);

	}

}
