package module_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_Test1 {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        // Initialize the driver here
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");
        Thread.sleep(2000);
    }

    @Test(dataProvider = "LoginDataProvider")
    public void login(String username, String password) {
        // Use the variables passed from DataProvider
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
    }

    @DataProvider(name = "LoginDataProvider")
    public Object[][] LoginData() {
        return new Object[][] {
            { "abc", "***" },
            { "xyz", "***" },
            { "mno", "***" }
        };
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
