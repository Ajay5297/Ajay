package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	      
	        
	        Actions a = new Actions(driver);
	        //build means this step is ready to execute and perform means it 
	        //moves to specific element
	        
	        a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	        
	        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("ajay").doubleClick().build().perform();
	        a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
	        
	}

}
