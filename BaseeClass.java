package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseeClass {

	public ChromeDriver driver;
	public String fileName;
	@Parameters({"url", "userName", "password"})
	@BeforeMethod (alwaysRun=true)
	public void beforeMethod(String url, String uName, String pswd) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(url);
		//get the title
		String Title = driver.getTitle();
		System.out.println(Title);
		
	 driver.findElement(By.id("username")).sendKeys(uName);
	// Enter the Password
	driver.findElement(By.id("password")).sendKeys(pswd);
	// click on login button
	driver.findElement(By.className("decorativeSubmit")).click();

	// click on CRM/SFA Link
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod (alwaysRun=true)
	public void afterMethod() throws InterruptedException {
Thread.sleep(60);

		driver.close();
		
}
	
	@DataProvider (name = "fetchData")
	public String[][] sendData() throws IOException
	{
     return ReadExcel.read(fileName);
	}
}
