package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Deletelead extends BaseeClass {
	@Test(dependsOnMethods = "week5.day2.MergeLead.mereLead")
	public  void deleLead() throws InterruptedException {
		
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Phone']")).click();
	        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8870419483");
	        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	        Thread.sleep(5000);
	    String Captureid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	      System.out.println(Captureid);
	        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	  	 driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Captureid);
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			String output = driver.findElement(By.xpath("//div[@class='x-paging-info'][@id='ext-gen437']")).getText();
			
			if(output==Captureid)
			{
				System.out.println("The first id is not yet deleted");
			}
			else {
				System.out.println("This message confirms the successful deletion");
			}
		
		}}

