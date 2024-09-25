package module_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_001 {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		

		// get data from excel file
		Xls_Reader reader = new Xls_Reader(
				"C://Users//Bunty//Desktop//Eclipse//SeleniumBatch_Aug2024//src//main//java//com//testdata//UserPass.xlsx");
		int rowCount = reader.getRowCount("Sheet1");
		
		//parameterization
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			
			String userName = reader.getCellData("Sheet1", "username", rowNum);
			System.out.println(userName);

			String passWord = reader.getCellData("Sheet1", "password", rowNum);
			System.out.println(passWord);
			
			//enter data
			driver.findElement(By.xpath("//input[@name='uid']")).clear();
			driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("userName");
			driver.findElement(By.xpath("//input[@name='password']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("passWord");
			driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			
			Alert a = driver.switchTo().alert();
			Thread.sleep(1000);
			//to close alert
			a.accept();
			

		}
			driver.quit();
	}

}
