package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass3 {
	
	
	public ChromeDriver driver;
	@Parameters({"url", "userName", "password"})
	@BeforeMethod (alwaysRun=true)
	public void beforeMethod(String url, String uName, String pswd) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get(url);	
		driver.switchTo().frame(0);
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pswd,Keys.ENTER);
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("incident",Keys.ENTER);
	}


	
}
