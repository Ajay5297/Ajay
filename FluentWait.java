package Synchronizationinselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
public class FluentWait {

	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	        driver.findElement(By.xpath("//button[text()='Start']")).click();
	        Wait<WebDriver> w= new FluentWait<WebDriver>(driver)

	}

}
