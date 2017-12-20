package test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_Finder_round_trip {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver" , "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/newtours/login.php");
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		driver.findElement(By.name("userName")).sendKeys("ram.thoutam@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mercury_tpr12");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//*[@name='tripType'][@value='roundtrip']")).click();
		
		Select passcount = new Select(driver.findElement(By.name("passCount")));
		passcount.selectByVisibleText("4");
		
		Select departfrom = new Select(driver.findElement(By.name("fromPort")));
		departfrom.selectByVisibleText("Frankfurt");
		
		Select onmonth = new Select(driver.findElement(By.name("fromMonth")));
		onmonth.selectByVisibleText("December");
		Select onday = new Select(driver.findElement(By.name("fromDay")));
		onday.selectByVisibleText("25");
		
		Select arrivingin = new Select(driver.findElement(By.name("toPort")));
		arrivingin.selectByVisibleText("London");
		
		Select returnmonth = new Select(driver.findElement(By.name("toMonth")));
		returnmonth.selectByVisibleText("January");
		Select returnday = new Select(driver.findElement(By.name("toDay")));
		returnday.selectByVisibleText("10");
		
		WebElement radiobtn1 = driver.findElement(By.xpath("//*[@name='servClass'][@value='Business']"));
		radiobtn1.click();
		
		Select airlineprference = new Select(driver.findElement(By.name("airline")));
		airlineprference.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		WebElement back2home = driver.findElement(By.xpath("//img[@src = 'images/home.gif']"));	
		back2home.click();
		
		driver.close();
	}

}
