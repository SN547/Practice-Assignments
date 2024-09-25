package module_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		// web table
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);	    
		
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
				
		System.out.println("Company names in the Web Table: ");
		
		for(WebElement companyName : companyNames) {
			System.out.println(companyName.getText());
		}
        
        driver.quit();

}
}