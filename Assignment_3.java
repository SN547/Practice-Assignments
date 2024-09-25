package module_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Actions, JavaScript Executors
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//first will find the element where i have to click
		driver.findElement(By.xpath("//a[normalize-space()='Draggable']")).click();
		Thread.sleep(2000);
		
		//switch to iframe which contain draggable element. (frame path)
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//find draggable element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions a = new Actions(driver);
		
		//perform drag and drop
		a.dragAndDropBy(drag, 100, 100).perform();
		Thread.sleep(2000);
		
		//take a screenshot		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
        //Copy the file to a location and use try catch block to handle exception
		try {
			FileUtils.copyFile(ss, new File("C:\\Users\\Bunty\\Pictures\\one.png"));
			System.out.println("Screenshot saved successfully");
			
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
				
		driver.quit();
	}

}
