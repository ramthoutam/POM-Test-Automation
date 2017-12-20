package test_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demo.guru99.com/selenium/newtours/login.php";
		driver.get(url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Krishna");
		driver.findElement(By.name("lastName")).sendKeys("thoutam");
		driver.findElement(By.name("phone")).sendKeys("+91 9989283035");
		driver.findElement(By.name("userName")).sendKeys("krishnaveni.jadala@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("#102, chandanagar");
		driver.findElement(By.name("city")).sendKeys("hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500050");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("krishnaveni.jadala@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kv_tpr12");
		driver.findElement(By.name("confirmPassword")).sendKeys("kv_tpr12");
		
		driver.findElement(By.name("submit")).click();
	
		driver.close();
			
	}

}
