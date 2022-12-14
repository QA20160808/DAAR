package jana.connection.com;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;


import jana.reposirty.com.Property;

/**
 *
 * @author Dipika Sehgal 14-02-2022
 *
 */
public class CommonMethods extends Connection {
	
	static String parentWindowHandler1 = driver.getWindowHandle(); // Store your parent window
	static String subWindowHandler1 = null;

	
	
	public static void popUpdissmiss() {
		System.out.println("TEST");
		driver.switchTo().alert().accept();
	}
	/*
	 * Common Method for ImplicityWait
	 */

	@SuppressWarnings("deprecation")
	public static void ImplicityWait(int timeinsec) {
		driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);
	}

	/*
	 * Common Method for ExplicityWait (No more in use)
	 */

	// @SuppressWarnings("deprecation")
	// public void ExplicityWait(int time)
	// {
	// WebDriverWait wait=new WebDriverWait(driver, time);
	// }

	/*
	 * Common Method for Wait by ThreadGroup
	 *
	 * @throws InterruptedException
	 */

	public void WaitByThreadGroup(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	/*
	 * Common Method for ScrollDown
	 */

	public static void scrolldown() throws InterruptedException {
	//	ImplicityWait(30000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
	}

	/*
	 * Common Method for ScrollUP
	 */

	public void scrollup() throws InterruptedException {
		ImplicityWait(300000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,-3000)");
	}

	/*
	 * Common Method for Close Browser
	 */

	public void close_browser() {
		driver.close();
	}

	/*
	 * Common method to refresh page
	 */

	public void refreshpage() {
		driver.navigate().refresh();
	}

	/*
	 *
	 * This function will take screenshot - Take a screenshot and move to the given
	 * folder location with name
	 *
	 * @param webdriver
	 *
	 * @param fileWithPath
	 *
	 * @throws Exception
	 *
	 */

	// public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws
	// Exception{
	//
	// //Convert web driver object to TakeScreenshot
	//
	// TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	//
	// //Call getScreenshotAs method to create image file
	//
	// File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	//
	// //Move image file to new destination
	//
	// File DestFile=new File(fileWithPath);
	//
	// //Copy file at destination
	//
	// FileUtils.copyFile(SrcFile, DestFile);
	//
	//
	// }

	/*
	 * optimize code for screenshot
	 */

	public void takeSnapShot(String foldername, String screenshotname) throws IOException

	{

		// Convert web driver object to TakeScreenshot

		// Call getScreenshotAs method to create image file

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = Property.testingresults + Property.pathurl + foldername + Property.pathurl + screenshotname;

		System.out.println(path);

		com.google.common.io.Files.copy(f, new File(path));

	}

	/**
	 *
	 * @param MousehoverEle - Hemant Sharma - 11-03-2022
	 */
	public void MouseHover(WebElement MousehoverEle) {
		Actions actions = new Actions(driver);

		// Hovering on main menu
		actions.moveToElement(MousehoverEle).perform();
	}


	public void waitforelement(int durationoftimeout, WebElement elements) {

	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(Connection.driver, durationoftimeout);
		wait.until(ExpectedConditions.visibilityOf(elements));
	}

	public static void mouseover(WebElement elm) {

		Actions action = new Actions(driver);
		action.moveToElement(elm).perform();
	}
	
	
	public static String genraterandomstring() {

		String alphabetsInUpperCase = "123ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789-"
				+ "!@#$%^&()--Q!" +".,?.2311";
		// create a super set of all characters
		String allCharacters = alphabetsInUpperCase;
		// initialize a string to hold result
		StringBuffer randomString = new StringBuffer();
		// loop for 10 times
		for (int i = 0; i < 10; i++) {
			// generate a random number between 0 and length of all characters
			int randomIndex = (int) (Math.random() * allCharacters.length());
			// retrieve character at index and add it to result
			randomString.append(allCharacters.charAt(randomIndex));

		}
		return randomString.toString();
	}
	
	
	public static void handlechildwindow() throws InterruptedException {
		
		
		Set<String> handles1 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator1 = handles1.iterator();
		while (iterator1.hasNext()) {
			subWindowHandler1 = iterator1.next();
		}
		
		driver.switchTo().window(subWindowHandler1);
		//driver.switchTo().window(parentWindowHandler1);
		
		
		
	}
	
	
	public static void moveonmainwin() {
	
		driver.switchTo().window(parentWindowHandler1);
		
		
	}
	
	
	public static String mobilenumber() {
		
		Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);
        
        int phoneNumber = num1 +  num2 + num3;
        
        String ph = String.valueOf(phoneNumber);
		return ph;

	}
	

	
	
	

}
	

	
