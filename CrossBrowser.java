package Ajay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CrossBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Ajay";
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("AjayPatil"); // Xpath by index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("Ajay"); // Css with index
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7721840979"); // xpath from parent to child with index
		driver.findElement(By.className("go-to-login-btn")).click();
		//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();  // tagname.classname another way to write css
		//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("input[id*='input']")).sendKeys("Ajay"); //css with partial text
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();// cuttomized xpath bye parent to child
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();  // xpath by text
		driver.quit();
		
		

	}

}
