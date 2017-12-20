package test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import come.pack.common.pageobjects.Signin_Page_Objects;


public class Sign_On {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver" , "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://demo.guru99.com/selenium/newtours/login.php");
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		driver.findElement(By.name("userName")).sendKeys("ram.thoutam@gmail.com");
		driver.findElement(By.name("password")).sendKeys("mercury_tpr12");
		new Signin_Page_Objects(driver).clickSignInButton();
		//driver.findElement(By.name("submit")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class="pbBody"][.//h3[text()='Employment']")));
		
		if(driver.findElement(By.xpath("//h3")).getText().equals("Login Successfully"))
		{
			System.out.println(driver.findElement(By.xpath("//h3")).getText());
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is Failed");
		}
		
		driver.close();
		
		
		
	}

}
