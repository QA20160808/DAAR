package qf.appmethods.com;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import qf.pom.com.Campains;
//Class should be abstract also loginMethod class should be extended as connectivity class is already extended by LoginMethod
public abstract class CampainsMethods extends LoginMethods
{
	static WebElement cproductsubtype;
	public void click_campainmodule()
	{
		Campains.nav_CampainModule.click();
	}
	public void click_campainicon()
	{
		Campains.icon_newcamp.click();
	}
	public void enter_campainname(String cname)
	{
		Campains.text_campainname.sendKeys(cname);
	}
	public void enter_campaincode(String ccode)
	{
		Campains.text_campaincode.sendKeys(ccode);
	}
//	public void campainscrolldown()
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,5000)");
//	}
	public void select_campainproductsubtype(String csubtype) throws InterruptedException
	{
		cproductsubtype=Campains.picker_campainproductsubtype;
		cproductsubtype.click();
		cproductsubtype.sendKeys("Mura");
		Thread.sleep(2000);
		cproductsubtype.sendKeys(Keys.ARROW_DOWN);
		cproductsubtype.sendKeys(Keys.ENTER);	
	}
	public void select_campainschemename(String cschemename)
	{
		new Select(Campains.dropdown_campainschemename).selectByValue(cschemename);
	}
	public void click_campainsave() throws InterruptedException
	{
		Campains.btn_campainsave.click();
		Thread.sleep(2000);
	}
}
