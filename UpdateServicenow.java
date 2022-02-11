package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UpdateServicenow extends CreateServicenow {
	@Test
	public  void udt() throws InterruptedException 
	{
		
	   WebElement element = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]"));
	   String incidentcreate = element.getText();
	   driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).click();
	   driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	   WebElement elment1 = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]"));
	   String incidentcrate1 = elment1.getText();
	   if (incidentcreate.equalsIgnoreCase(incidentcrate1)) {
		   
		   System.out.println("UPDATED SUCCESSFULLY" );
	   }
    }
}