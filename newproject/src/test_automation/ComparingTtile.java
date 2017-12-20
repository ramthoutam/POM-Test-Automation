package test_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingTtile {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://google.com";
		String expectedTitle = "Google";
		String actualTitle = "";
		
		driver.get(url);
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test is Passed");
		}
			else{
				System.out.println("Test is Failed");

				}
				
			driver.close();
		}

}
