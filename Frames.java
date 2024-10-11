package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
      
        System.out.println(  driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("draggable")).click();
        Actions a = new Actions(driver);
     
        a.dragAndDrop(driver.findElement(By.xpath("//p[text()='Drag me to my target']")), driver.findElement(By.id("droppable"))).build().perform();
        driver.switchTo().defaultContent();
	}

}
