package test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver" , "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys("ram.thoutam@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mercury_tpr12");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.xpath("//h3")).getText().equals("Login Successfully");
		System.out.println("User Login = " + driver.findElement(By.xpath("//h3")).getText());
		
		if(driver.findElement(By.xpath("//h3")).getText().equals("Login Successfully"))
		{
			System.out.println("The Test is Passed");
		}
		else
		{
			System.out.println("The Test is Failed");
		}
		
		driver.close(); 
		
		
	}

}
