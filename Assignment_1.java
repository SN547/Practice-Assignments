package module_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		// Locators working with Web Elements
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.getTitle();
		driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
