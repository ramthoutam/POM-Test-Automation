package come.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin_Page_Objects {
	
	public static WebDriver driver;
	
	public static By SignOnButton = By.linkText("login.php");
	public static By UserName = By.name("userName");
	public static By Password = By.name("password");
	public static By Submit = By.name("submit");
	
	public Signin_Page_Objects(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSignInButton(){
		WebElement element = driver.findElement(By.name("submit"));
		element.click();
		
	}
}

	
