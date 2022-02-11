package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Deleteservicenow extends CreateServicenow {
	@Test
	public void del() throws InterruptedException, IOException
	{
		 WebElement element = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]"));
		   String incidentcreate = element.getText();
		   System.out.println(incidentcreate);
		driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).click();
	 driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
	   driver.findElement(By.xpath("//button[@class='btn btn-destructive']")).click();
	   Thread.sleep(10000);
	File screenshot= driver.getScreenshotAs(OutputType.FILE);
	File destination= new File("./images/Hscreen.png");
	FileUtils.copyFile(screenshot, destination);
}
}