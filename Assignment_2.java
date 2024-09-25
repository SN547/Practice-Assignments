package module_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// Handling Alerts, Frames, Windows
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Shrddha_N");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(1000);
		
		a1.accept();
		
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(1000);
		
		a2.accept();
			
		driver.quit();

	}

}
