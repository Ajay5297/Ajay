package AddtoKart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtokart2 {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
		
		String[] Itemsneeded = {"Cucumber", "Brocolli"};
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> Products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for(int i=0;i<Products.size();i++)
		{
			String Name = Products.get(i).getText();
		if(Name.contains("Cucumber"))
			{
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				break;
			}
		}

	}

}
