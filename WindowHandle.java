package ActionClass;

import java.awt.event.WindowStateListener;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
        Set<String> Adress = driver.getWindowHandles();
        // we stored id into set data structure to pull that we itrator method.
        Iterator<String> it = Adress.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("AjayPatil");
        Thread.sleep(2000);
        driver.switchTo().window(parent);
        

	}

}
