package Synchronizationinselenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	        WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(5000));
			
			String[] Itemsneeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
				
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			//ImplicitWait wait = new ImplicitWait();
			//wait.ajay(driver, Itemsneeded);
			// or ajay(driver, Itemsneeded)
			
			ajay(driver, Itemsneeded);
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			// wait until the promo code check displayed
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
			
			driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("RahulShettyacademy");
			driver.findElement(By.xpath("//button[text()='Apply']")).click();
			
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Invalid code ..!']")));
			System.out.println(driver.findElement(By.xpath("//span[text()='Invalid code ..!']")).getText());
		}
		
		public static void ajay(WebDriver driver, String[] Itemsneeded)
		{
	         List<WebElement> Products = driver.findElements(By.cssSelector("h4[class='product-name']"));
			
			for(int i=0;i<Products.size();i++)
			{
				//Brocolli - 1 Kg
						
				
				String[] name = Products.get(i).getText().split("-");
				String Formatedname = name[0].trim();
				//Check extracted name present in the the array or not
				//convert array into array list tfor wasy search
				List al = Arrays.asList(Itemsneeded);
				int j=0;
				if(al.contains(Formatedname))
				{
					j++;
					driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
					if(j==Itemsneeded.length)
					{
						break;
					}
					
				}
				


			}


	}

}
