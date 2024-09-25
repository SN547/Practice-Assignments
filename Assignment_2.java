package module_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// Find country dropdown 'Kuwait'
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='KUWAIT']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
