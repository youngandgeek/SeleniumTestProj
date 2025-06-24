package projectOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelenIntro  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoking browser and it's methods by creating an obj of browserDriver class
		//invoke the .exe of the browser driver manually or by using SeleniumManager
		
	/**	
	 * System.setProperty("webdriver.chrome.driver","C:\\Users\\Global Expert\\Downloads\\chromedriver-win64\\chromedriver.exe");
	
		//add browser driver 	 
		WebDriver driver=new ChromeDriver();
		*/
		
		/*add Firefox browser 
		 * geckoDriver 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Global Expert\\Downloads\\gecko...exe");
		
	     WebDriver driver =new FireFoxDriver();
		*/
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Global Expert\\Downloads\\msedgedriver.exe");
		
		//add browser driver 	 
		WebDriver driver=new EdgeDriver();
		
		//navigate to a url
		
		driver.get("https://en.wikipedia.org/wiki/Website");
		
		/*get title 
		
		*driver.getTitle();
		
		*/
		
		//get the current url you're navigating to in the console
		
			System.out.println(driver.getCurrentUrl());
				
		//to print the title in the console 
		System.out.println(driver.getTitle());
		
		
		
		/*close the browser
		    driver.close();
		
		/driver.quit()
		/ close all associated windows that got open by selenium,Ends the WebDriver session
		**/
	}

}
