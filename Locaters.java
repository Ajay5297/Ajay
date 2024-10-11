package Ajay;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Ajay";
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.facebook.com/login/");
//		driver.findElement(By.id("email")).sendKeys("7721840979");
//		driver.findElement(By.name("pass")).sendKeys("Aay@1234");
//		driver.findElement(By.cssSelector("button[name='login']")).click();
		//System.out.println(driver.findElement(By.className("_9ay7")).getText());
		//Assert.assertEquals(driver.findElement(By.className("_9ay7")).getText(), "The password that you've entered is incorrect. Forgotten password?");
//		Above assertion is used to verify the output is not correct or not or for compair
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.xpath("//input[@dir='ltr']")).sendKeys("7721840979");  // Xpath by attribute
//		driver.findElement(By.cssSelector("input[dir='ltr']")).sendKeys("ajay");
//		driver.findElement(By.cssSelector("input[dir='ltr']")).clear();  // CSS format
		
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
		
		
//		Imp question for interview
//		Xpath by axis means how to reach sibling to another sibling  ... parent to child 
//
//		//header/div/button[1]/following-sibling::button[1]
//
//		How to traverse from child to parent
//		//header/div/button[1]/parent::div
//	
	}

}
